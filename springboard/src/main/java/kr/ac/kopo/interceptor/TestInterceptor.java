package kr.ac.kopo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.member.vo.MemberVO;

@Component
public class TestInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("TestInterceptor preHandle()");
		HttpSession session = request.getSession();
		session.setAttribute("dest",request.getServletPath());
		// 정상 login시에 등록 POST/
		MemberVO memberVO = (MemberVO) session.getAttribute("currentUser");
		if (memberVO != null) { // 로그인 되어 있는 경우. true를 리턴으로 handler에게 제어권 넘김
			return true;
		} else {
			// 로그인 안되어 있는 경우에는 return false를 하고,
			// redirect를 해서 login.jsp로 보낸다.
			// http://localhost:8080/springboard/login
			System.out.println("로그인 아직 안되어 있어서 login 페이지로 변경됨");
			response.sendRedirect(request.getContextPath() + "/login");// 게속 로그인페이지로온다.-> exclude mappingg하자
			return false;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("TestInterceptor postHandle()");

		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

}

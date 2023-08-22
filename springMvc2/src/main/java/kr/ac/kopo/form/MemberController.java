package kr.ac.kopo.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@GetMapping("/member/joinForm")
	public String joinForm() {
		return "member/joinForm";
		// WEB-INF/jsp/member/joinForm.jsp
	}

//	@PostMapping("/member/join")
	public String join(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		request.setAttribute("member", member);
		return "member/memberInfo";
	}

//	@PostMapping("/member/join")
	public String join2(HttpServletRequest request, @RequestParam("id") String id2,
			@RequestParam("password") String password2) {
//		String id=request.getParameter("id");
//		String password=request.getParameter("password");

		MemberVO member = new MemberVO();
		member.setId(id2);
		member.setPassword(password2);
		request.setAttribute("member", member);
		return "member/memberInfo";
	}

//	@RequestParam("name") name 동일하다면 @RequestParam 생략가능
//	@PostMapping("/member/join")
	public String join3(HttpServletRequest request, String id, String password) {
//		String id=request.getParameter("id");
//		String password=request.getParameter("password");

		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		request.setAttribute("member", member);
		return "member/memberInfo";
	}

//	따로 등록하지 않고 그냥 memberInfo에서 memberVO.id를 하면 사용가능(매우 편리)
//	@PostMapping("/member/join")
	public String join4(MemberVO member) {

		return "member/memberInfo";
	}
	
//	꼭 변수명을 달리 쓰고 싶으면 ModelAttribute
//	@PostMapping("/member/join")
	public String join5(@ModelAttribute("member") MemberVO member) {
		return "member/memberInfo";
	}
	
	
	@PostMapping("/member/join")
	public ModelAndView join6(MemberVO member) {
//		ModelAndView mav=new ModelAndView();
//		mav.setViewName("member/memberInfo");
		ModelAndView mav=new ModelAndView("member/memberInfo");
		mav.addObject("member",member);
		return mav;

	}

}

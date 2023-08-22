package kr.ac.kopo.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	
	@GetMapping("/member/joinForm")
	public String joinForm() {
		return "member/joinForm";
		//WEB-INF/jsp/member/joinForm.jsp
	}
	
	@PostMapping("/member/join")
	public String join(HttpServletRequest request) {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberVO member=new MemberVO();
		member.setId(id);
		member.setPassword(password);
		request.setAttribute("member", member);
		return "member/memberInfo";
	}

}

package kr.ac.kopo.member.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.LoginVO;
import kr.ac.kopo.member.vo.MemberVO;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;

	@GetMapping("/login")
	public String loginForm(Model model) {
		LoginVO loginVO = new LoginVO();
		model.addAttribute(loginVO);
		return "member/loginForm";
	}

	@PostMapping("/login")
	public String loginProcess(@Valid LoginVO loginVO, Errors errors, Model model) {

		if (errors.hasErrors()) { // error가 존재
			return "member/loginForm"; // 다시 로그인하는 페이지로 이동

		} else { // null값이 없을 떄, DB query 실행
			MemberVO memberVO = memberService.login(loginVO);
			if (memberVO == null) {
				System.out.println("id, password틀림");
				model.addAttribute("msg", "id, password 다시 확인하세요");
				return "member/loginForm"; // 다시 로그인하는 페이지로 이동
			} else {
				System.out.println(memberVO);
				System.out.println("login이 완료되었습니다.");
				return "redirect:/board";
				// http://localhost:8080/springboard/board
			}
		}
	}
	
	@GetMapping("/join")
	public String joinForm(Model model) {
		MemberVO memberVO=new MemberVO();
		model.addAttribute(memberVO);
		return "member/joinForm";
	}
	
	@PostMapping("/join")
	public String joinProcess(@Valid MemberVO memberVO,Errors errors,Model model)  {
		if (errors.hasErrors()) {
			System.out.println("null있음");
			model.addAttribute("msg", "null이 있어요");
			return "member/joinForm";
		} else {
			memberService.join(memberVO);
			System.out.println("회원가입완료");
			return "redirect:/board";
		}
	}
	

}

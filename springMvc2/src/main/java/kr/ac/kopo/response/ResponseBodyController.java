package kr.ac.kopo.response;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.form.MemberVO;

@RestController
public class ResponseBodyController {

//	1.url
//	2.bean 객체 생성
//	3. @ResponseBody 붙이기

	@RequestMapping("/stringresponse")
	public String response() {
		return "ok.성공";

	}

	@RequestMapping("/voresponse")
	public MemberVO voresponse() {
		MemberVO member = new MemberVO();
		member.setId("홍");
		member.setPassword("1111");
		return member;
	}

//	@ResponseBody //	handler에 매핑
	@RequestMapping("/vovoresponse")
	public MemberVO vovoresponse() {
		MemberVO member = new MemberVO();
		List<MemberVO> voList = new ArrayList();
		member.setId("홍");
		member.setPassword("1111");
		return member;
	}

}

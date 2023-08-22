package kr.ac.kopo.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.form.MemberVO;

@Controller
public class ResponseBodyController {
	
//	1.url
//	2.bean 객체 생성
//	3. @ResponseBody 붙이기
	
	
	@ResponseBody
    @RequestMapping("/voresponse")
    public MemberVO voresponse() {
        MemberVO member = new MemberVO();
       member.setId("홍");
       member.setPassword("1111");
       return member;
    }

	
	@ResponseBody
	@RequestMapping("/stringresponse")
	public String response() {
		return "ok.성공";
		
	}

}

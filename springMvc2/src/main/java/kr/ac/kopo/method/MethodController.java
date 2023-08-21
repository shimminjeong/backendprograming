package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/method/method")
@Controller
public class MethodController {

	// http://localhost:8080/springMvc2/method/method
	@RequestMapping(method = RequestMethod.GET)
	public String get() { // doGet() modelandview string만 줘도 됨
		// view 이름을 return
		// /WEB-INF/jsp/method/methodForm.jsp
		return "method/methodForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String post() {
		System.out.println("post 요청 받았어요");
		return "method/methodProcess"; // view name return
//		WEB-INF/jsp/method/methodProcess.jsp
	}
}

package kr.ac.kopo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	// handler 생성
	// method . client 가 요청하면, 요청을 받아주는 것
	// http://localhost:8080/springmvc/hello/hello"
	@RequestMapping("/hello/hello")
	public ModelAndView hello() {
		
		ModelAndView mav = new ModelAndView("hello/hello");
		mav.addObject("msg", "HelloWorld");
		
		// view -> jsp file
		// WEB-INF/jsp/hello/hello.jsp
		// WEB-INF/jsp/ + value + .jsp   viewResolve가
		return mav;
		
	}

}

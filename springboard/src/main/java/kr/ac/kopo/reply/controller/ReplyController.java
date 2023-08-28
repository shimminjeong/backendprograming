package kr.ac.kopo.reply.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.reply.service.ReplyService;
import kr.ac.kopo.reply.vo.ReplyVO;

@Controller
public class ReplyController {
	
	@Autowired
	private ReplyService replyService;
	
	@ResponseBody //를 붙여야해 아님 return "reply.jsp"를 찾으려고한다.
	@PostMapping("/reply")
	public void writeReply(ReplyVO replyVO) {
		System.out.println("replyVO"+replyVO.getBoardNo());
		System.out.println("replyVO"+replyVO.getContent());
		System.out.println("replyVO"+replyVO.getWriter());
		replyService.insertReply(replyVO);
		
	}

}

package kr.ac.kopo.reply.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.reply.service.ReplyService;
import kr.ac.kopo.reply.vo.ReplyVO;

@Controller
public class ReplyController {

	@Autowired
	private ReplyService replyService;

	@ResponseBody // 를 붙여야해 아님 return "reply.jsp"를 찾으려고한다.
	@PostMapping("/reply")
	public void writeReply(ReplyVO replyVO) {
		System.out.println("replyVO" + replyVO.getBno());
		System.out.println("replyVO" + replyVO.getContent());
		System.out.println("replyVO" + replyVO.getWriter());
		replyService.insertReply(replyVO);

	}

	@GetMapping("/reply/{bno}")
	@ResponseBody // view를 안넘긴단 의미 데이터만 넘길게
	public List<ReplyVO> getAllReply(@PathVariable("bno") int bno) {
		List<ReplyVO> replylist = replyService.getReplyBoardNo(bno);
		for (ReplyVO replyVO : replylist) {
			System.out.println(replyVO);
		}
		return replylist;
	}

}

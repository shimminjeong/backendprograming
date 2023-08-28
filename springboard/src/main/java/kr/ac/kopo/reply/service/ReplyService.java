package kr.ac.kopo.reply.service;

import java.util.List;

import kr.ac.kopo.reply.vo.ReplyVO;

public interface ReplyService {

	void insertReply(ReplyVO replyVO);
	
	List<ReplyVO> getReplyBoardNo(int bno);
	
	void deleteReplyByNo(int replyNo);

}

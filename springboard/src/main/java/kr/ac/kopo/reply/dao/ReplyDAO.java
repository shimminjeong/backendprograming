package kr.ac.kopo.reply.dao;

import java.util.List;

import kr.ac.kopo.reply.vo.ReplyVO;

public interface ReplyDAO {
	
	void insertReply(ReplyVO replyVO);
	
	List<ReplyVO> getReplyBoardNo(int bno);
	
	void deleteReplyByNo(int replyNo);

}

package kr.ac.kopo.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.reply.dao.ReplyDAO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyDAO replyDAO;
	
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public void insertReply(ReplyVO replyVO) {
		
//		댓글수 증가-t_board
//		reply insert - t_reply, board_no받아서, count+1
		boardDAO.increaseCount(replyVO.getBoardNo());
		
		replyDAO.insertReply(replyVO);
	}

	@Override
	public List<ReplyVO> getReplyBoardNo(int bno) {
		List<ReplyVO> replylist = replyDAO.getReplyBoardNo(bno);
		return replylist;
	}

	@Override
	public void deleteReplyByNo(int replyNo) {
		replyDAO.deleteReplyByNo(replyNo);
	}

}

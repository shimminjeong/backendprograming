package kr.ac.kopo.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
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

	@Transactional
	@Override
	public void deleteReplyByNo(int boardNo, int replyNo) {

//		1. 댓글수 1 감소 t_board
		boardDAO.decreaseCount(boardNo);
//		2. 100번 댓글 지워줘 
		replyDAO.deleteReplyByNo(replyNo);
	}

}

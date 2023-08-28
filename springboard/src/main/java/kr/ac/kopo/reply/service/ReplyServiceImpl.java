package kr.ac.kopo.reply.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.reply.dao.ReplyDAO;
import kr.ac.kopo.reply.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	private ReplyDAO replyDAO;

	@Override
	public void insertReply(ReplyVO replyVO) {
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

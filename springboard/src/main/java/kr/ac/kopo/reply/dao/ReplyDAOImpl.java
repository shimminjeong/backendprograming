package kr.ac.kopo.reply.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.reply.vo.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public void insertReply(ReplyVO replyVO) {
		sqlSessionTemplate.insert("springboard.replyDAO.insertReply", replyVO);

	}
	
	public List<ReplyVO> getReplyBoardNo(int bno){
		List<ReplyVO> replylist=sqlSessionTemplate.selectList("springboard.replyDAO.selectByBoardNo",bno);
		return replylist;
	}
}

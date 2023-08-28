package kr.ac.kopo.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.board.vo.BoardVO;

@Repository
public class BoardDAOImple implements BoardDAO {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<BoardVO> getAllPost() {
		List<BoardVO> boardlist = sqlSessionTemplate.selectList("springboard.board.dao.BoardDAO.selectAll");
		// mybatis가 아는 이름(namesapce) .sql문의 이름 mapper.xml
		return boardlist;
	}

	@Override
	public BoardVO getPostByNo(int no) {
		BoardVO boardVO = sqlSessionTemplate.selectOne("springboard.board.dao.BoardDAO.selectbyNo",no);
		return boardVO;
	}

	@Override
	public void writeNewPost(BoardVO boardVO) {
		sqlSessionTemplate.insert("springboard.board.dao.BoardDAO.insert",boardVO);
		
	}

	@Override
	public void increaseCount(int no) {
		sqlSessionTemplate.update("springboard.board.dao.BoardDAO.increaseCount",no);
		
	}

	@Override
	public void decreaseCount(int no) {
		sqlSessionTemplate.update("springboard.board.dao.BoardDAO.decreaseCount",no);
		
	}

}

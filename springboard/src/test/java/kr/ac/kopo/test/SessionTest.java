package kr.ac.kopo.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.service.BoardServiceImpl;
import kr.ac.kopo.board.vo.BoardVO;

@ContextConfiguration(locations = { "classpath:config/spring/spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SessionTest {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Autowired
	private BoardServiceImpl boardServiceImpl;
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Test
	public void replyTest() {
		boardDAO.increaseCount(3); //3번 게시글 count 1올려라
	}
	
	@Test
	public void selectByNoTest() {
		BoardVO board = sqlSessionTemplate.selectOne("springboard.board.dao.BoardDAO.selectbyNo",5);
			System.out.println(board);
	}
	
	@Ignore
	@Test
	public void BoardServiceTest() {
		List<BoardVO> boardlist = boardServiceImpl.getAllBoard();
		for (BoardVO boardVO: boardlist) {
			System.out.println(boardVO);
		}
	}

	@Ignore
	@Test
	public void sessionTemplataTest() {
		assertNotNull(sqlSessionTemplate);
		System.out.println(sqlSessionTemplate);

	}

	@Ignore
	@Test
	public void boardSelectAllTest() {
		List<BoardVO> boardlist = sqlSessionTemplate.selectList("springboard.board.dao.BoardDAO.selectAll");
		for (BoardVO boardVO : boardlist) {
			System.out.println(boardVO);
		}
	}
	
	

}

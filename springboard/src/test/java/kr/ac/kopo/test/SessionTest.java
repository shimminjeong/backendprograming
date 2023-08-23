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

import kr.ac.kopo.board.vo.BoardVO;

@ContextConfiguration(locations = { "classpath:config/spring/spring-config.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class SessionTest {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Ignore
	@Test
	public void sessionTemplataTest() {
		assertNotNull(sqlSessionTemplate);
		System.out.println(sqlSessionTemplate);

	}

	@Test
	public void boardSelectAllTest() {
		List<BoardVO> boardlist = sqlSessionTemplate.selectList("springboard.board.dao.BoardDAO.selectAll");
		for (BoardVO boardVO : boardlist) {
			System.out.println(boardVO);
		}
	}

	@Test
	public void sessionTemplateTest2() {
//		List<MemberVO> boardlist=sqlSessionTemplate.selectList("name)
	}

}

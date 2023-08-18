package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {

	private SqlSession sqlSession;

	public BoardDAO() {

	}

	public BoardDAO(SqlSession session) {
		this.sqlSession = session;
	}

	public void work() {
//		insertNewPost();
		selectAllPost();
	}

	public void selectAllPost() {
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectAll");
		for (BoardVO board : boardList) {
            System.out.println("Board NO: " + board.getNo());
            System.out.println("Board NO: " + board.getWriter());
            System.out.println("Title: " + board.getTitle());
            System.out.println("Content: " + board.getContent());
            // ... 다른 멤버 변수 출력
            System.out.println("-------------------------------------");
        }
	}

	public void insertNewPost() {
//		sqlSession.insert("mybatis.BoardDAO.insertNewPost");
//		sqlSession.commit();
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("세번째 제목");
		boardVO.setWriter("김길동");
		boardVO.setContent("내용이요");
		sqlSession.insert("mybatis.BoardDAO.insertNewPost2", boardVO);
		sqlSession.commit();
	}

}

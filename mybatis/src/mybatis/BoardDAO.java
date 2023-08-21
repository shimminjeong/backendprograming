package mybatis;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
//		selectAllPost();
//		selectbyName();
//		selectbyName2();
//		selectbyNo();
//		selectbyNo2();
//		deletePost();
//		updatePost();
//		selectDynamicSQL();
//		selectDynamicSQLif1();
//		selectDynamicSQLif2();
//		selectDforeach1();
		selectDforeach2();
	}

////////////////////	dynamicsql

	public void selectDynamicSQL() {
		BoardVO inputboardVO = new BoardVO();
//		inputboardVO.setWriter("홍길동");
		inputboardVO.setTitle("좋은아침");
		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectDSQL", inputboardVO);

		for (BoardVO resultboardVO : boardlist) {
			System.out.println(resultboardVO);
		}

	}

//	if input : string
	public void selectDynamicSQLif1() {
//		이면 안됨
//		List<BoardVO> boardlist=sqlSession.selectList("mybatis.BoardDAO.selectDSQLif1","아침");
		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectDSQLif1");
		for (BoardVO boardVO : boardlist) {
			System.out.println(boardVO);
		}

	}

//	if input : object
	public void selectDynamicSQLif2() {
		BoardVO inputboardVO = new BoardVO();
		inputboardVO.setTitle("좋은아침");
		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectDSQLif2", inputboardVO);
		for (BoardVO boardVO : boardlist) {
			System.out.println(boardVO);
		}

	}

	// foreach input : array
	public void selectDforeach1() {
		int[] a = { 1, 2, 3, 4, 5 };
		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectDforeach1", a);
		for (BoardVO boardVO : boardlist) {
			System.out.println(boardVO);
		}
	}

	
	// foreach input : object (array)
	public void selectDforeach2() {
		BoardVO board = new BoardVO();
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		board.setNumbers(a);
		List<BoardVO> boardlist = sqlSession.selectList("mybatis.BoardDAO.selectDforeach2",board);
		for (BoardVO boardVO : boardlist) {
			System.out.println(boardVO);
		}
	}

/////////////////////////////////	

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

	public void updatePost() {
		BoardVO boardVO = new BoardVO();
		boardVO.setNo(8);
		boardVO.setContent("내용 변경");
		sqlSession.update("mybatis.BoardDAO.updatePost", boardVO);
		sqlSession.commit();
	}

	public void deletePost() {
		int no = 10;
		sqlSession.delete("mybatis.BoardDAO.deletePost", no);
		sqlSession.commit();
	}

	public void selectbyName() {
		BoardVO boardVO = new BoardVO();
		boardVO.setWriter("김길동");
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectbyName", boardVO);
		for (BoardVO board : boardList) {
			System.out.println("Board NO: " + board.getNo());
			System.out.println("Board NO: " + board.getWriter());
			System.out.println("Title: " + board.getTitle());
			System.out.println("Content: " + board.getContent());
			System.out.println("regdate: " + board.getRegDate());
			// ... 다른 멤버 변수 출력
			System.out.println("-------------------------------------");
		}
	}

	public void selectbyName2() {
		String name = "김길동";
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectbyName2", name);
		for (BoardVO board : boardList) {
			System.out.println("Board NO: " + board.getNo());
			System.out.println("Board NO: " + board.getWriter());
			System.out.println("Title: " + board.getTitle());
			System.out.println("Content: " + board.getContent());
			System.out.println("regdate: " + board.getRegDate());
			// ... 다른 멤버 변수 출력
			System.out.println("-------------------------------------");
		}
	}

	public void selectbyNo() {
		int no = 10;
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectbyNo", no);
		for (BoardVO board : boardList) {
			System.out.println("Board NO: " + board.getNo());
			System.out.println("Writer: " + board.getWriter());
			System.out.println("Title: " + board.getTitle());
			System.out.println("Content: " + board.getContent());
			System.out.println("regdate: " + board.getRegDate());
			// ... 다른 멤버 변수 출력
			System.out.println("-------------------------------------");
		}
	}

	public void selectbyNo2() {
		// map을 resultType으로 준다.
		int no = 10;
		Map<String, Object> map = sqlSession.selectOne("mybatis.BoardDAO.selectbyNo2", no);
		Set<String> keyset = map.keySet(); // {no,title,writer,}
		for (String key : keyset) {
			System.out.println(key + ": " + map.get(key));
		}
	}

}

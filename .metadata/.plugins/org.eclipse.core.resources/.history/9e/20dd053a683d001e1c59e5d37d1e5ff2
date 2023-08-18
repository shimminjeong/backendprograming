package mybatis;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {

	private SqlSession sqlSession;

	public BoardDAO() {

	}

	public BoardDAO(SqlSession session) {
		this.sqlSession = session;
	}

	public void work() {
		insertNewPost();
	}

	public void insertNewPost() {
		sqlSession.insert("mybatis.BoardDAO.insertNewPost");
		sqlSession.commit();
	}

}

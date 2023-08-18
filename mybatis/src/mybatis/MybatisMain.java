package mybatis;

public class MybatisMain {

	public static void main(String[] args) {

		Config config = new Config(); // sqlsession만들어서 가지고 있어 sqlsession 가지고 있어
		BoardDAO boardDAO = new BoardDAO(config.getSqlSession());
		config.getSqlSession();
		boardDAO.work();

	}

}

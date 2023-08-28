package kr.ac.kopo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;

	@Override
	public List<BoardVO> getAllBoard() {
		// BoardDAO한테 일을 시킴. data 가져와
		// 가공
		List<BoardVO> boardlist = boardDAO.getAllPost();
		return boardlist;
	}

	@Override
	public BoardVO getPostByNo(int no) {
		return boardDAO.getPostByNo(no);
	}

	@Override
	public void writeNewPost(BoardVO boardVO) {
		boardDAO.writeNewPost(boardVO);
		
	}


}

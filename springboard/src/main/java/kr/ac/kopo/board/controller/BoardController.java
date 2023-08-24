package kr.ac.kopo.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	
//	/category/{cid}/product/{pid}
//	public String getPostByNo2(@PathVariable("cid") int cid, @PathVariable("pid") int pid) {}; 
	
	@GetMapping("/board/new")
	public String newPost() {
		return "board/writeForm";
	}
	

	@PostMapping("/board/new")
	public String newPostProcess(BoardVO boardVO) {
//		data관련작업
//		boardService 일을 시킴
//		boardVO insert해
		boardService.writeNewPost(boardVO);
		return "redirect:/board";
		//http://localhost:8080/springboard/board
	}
	
	
//	http://localhost:8080/springboard/board/10
	@GetMapping("/board/{no}")
	public String getPostByNo2(@PathVariable("no") int no, Model model) {
		BoardVO boardvo = boardService.getPostByNo(no);
		model.addAttribute("boardVO", boardvo);
		return "board/detail";
	}

	
//	http://localhost:8080/springboard/post?no=10
//	@GetMapping("/post")
	public String getPostByNo(@RequestParam("no") int no, Model model) {
		BoardVO boardvo = boardService.getPostByNo(no);
		model.addAttribute("boardVO", boardvo);
		return "board/detail";
	}

	@GetMapping("/board")
	public ModelAndView getAllBoard() {
//		WEB-INF/jps/	board/boardlist		.jsp
		ModelAndView mav = new ModelAndView("board/boardlist");
		List<BoardVO> boardlist = boardService.getAllBoard();
		mav.addObject("boardlist", boardlist);
		return mav;
	}
}

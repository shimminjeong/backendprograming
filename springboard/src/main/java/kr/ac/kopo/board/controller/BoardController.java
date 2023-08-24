package kr.ac.kopo.board.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String newPost(Model model) {
		
//		만들어서 jsp 보내줌
		BoardVO boardVO=new BoardVO();
//		boardVO.setTitle("기본제목"); //form title에 기본제목을 넣어놔
		model.addAttribute("boardVO",boardVO);
		return "board/writeForm";
	}

	@PostMapping("/board/new")
	public String newPostProcess(@Valid BoardVO boardVO, BindingResult br) {
		// boardvo에 null이 있는지 확인해서 br에 넣어줌
		if (br.hasErrors()) {
			System.out.println("null값이 있습니다.");
			return "board/writeForm";
		}else {
			System.out.println("error가 없습니다.");
			boardService.writeNewPost(boardVO);
			return "redirect:/board"; //jsp아님
			// http://localhost:8080/springboard/board
		}
		
		
		
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

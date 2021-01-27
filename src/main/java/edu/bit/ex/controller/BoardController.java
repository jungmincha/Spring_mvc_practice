package edu.bit.ex.controller;



import javax.servlet.http.HttpServletRequest;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import edu.bit.ex.service.BoardService;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@AllArgsConstructor
@Controller
public class BoardController {//비즈니스 로직이 오면 안된다. 이제는 스프링에서의 컨트롤러 역할이 뷰에 전달해주는 것 밖에 없다. 
	
	//@Autowired 5이상은 안써줘도 된다. 
	private BoardService boardService ; //컨트롤러에서 서비스 호출한다.

	@GetMapping("/list")
	public void list(Model model) {
		log.info("list"); //시스템 디버깅
	model.addAttribute("list" , boardService.getList());
	}
	
	
	
	
	@GetMapping("/write_view")
	public String writeview(Model model) {
		log.info("write_view");
		
		return "write_view";
	}
	

	
	@PostMapping("/write ")
	public String write(BoardVO boardVO , Model model)throws Exception {
		log.info("write()");
		
		boardService.writeBoard(boardVO);
		
		return "redirect:list";
		
	}

	
}

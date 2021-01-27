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
public class BoardController {//����Ͻ� ������ ���� �ȵȴ�. ������ ������������ ��Ʈ�ѷ� ������ �信 �������ִ� �� �ۿ� ����. 
	
	//@Autowired 5�̻��� �Ƚ��൵ �ȴ�. 
	private BoardService boardService ; //��Ʈ�ѷ����� ���� ȣ���Ѵ�.

	@GetMapping("/list")
	public void list(Model model) {
		log.info("list"); //�ý��� �����
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

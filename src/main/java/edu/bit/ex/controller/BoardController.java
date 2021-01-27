package edu.bit.ex.controller;



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
public class BoardController {
   
   private BoardService boardService;
   
   @GetMapping("/list")
   public void list(Model model) {
      log.info("list");
      model.addAttribute("list", boardService.getList());
   }
   
   
   @GetMapping("/write_view")//글작성폼 페이지 이동
   public String write_view() {   
      log.info("write_view");
      return "write_view";
   } 
   
   
   @PostMapping("/write")//글작성 폼에서 정보입력(즉, insert)
   public String write( BoardVO boardVO, Model model)throws Exception {
      log.info("write");
      boardService.writeBoard(boardVO); 
      return "redirect:list";
   }
   
   @PostMapping("/modify")
   public String modify( BoardVO boardVO, Model model)throws Exception {
      log.info("modify");
      boardService.modifyBoard(boardVO); 
      return "redirect:list";
   }
   
   
   
   
   @GetMapping("/content_view")
   public String content_view(BoardVO boardVO, Model model) throws Exception{
      log.info("content_view");
      
      model.addAttribute("content_view", boardService.getBoard(boardVO.getbId()));
      
      boardService.upHit(boardVO.getbId());
      
      
      return "content_view";
   }
   
   
   @GetMapping("/reply_view")
   public String reply_view(BoardVO boardVO, Model model) throws Exception{
      log.info("reply_view");
      
      model.addAttribute("reply_view", boardService.getReply(boardVO.getbId()));
      return "reply_view";
   }
   
   @PostMapping("/reply")
   public String reply( BoardVO boardVO, Model model)throws Exception {
      log.info("reply");
      boardService.replyBoard(boardVO); 
      
      boardService.replyShape(boardVO); 
      
      return "redirect:list";
   }
   
   
   
   
   @GetMapping("/delete")
   public String delete(BoardVO boardVO, Model model) throws Exception{

      
      
      log.info("delete");
      boardService.inputDelete(boardVO.getbId());
      
      
      return "redirect:list";
   }
   
   
   
   
   
   
}
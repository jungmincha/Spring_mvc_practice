package edu.bit.ex.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import lombok.Setter;
import lombok.extern.log4j.Log4j;


//톰캣을 다루는 부분이 아니다. 그러기 때문에 테스트 하기 까다롭다 

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j

public class BoardControllerTest {
	
	   @Setter(onMethod_ = { @Autowired })
	   private WebApplicationContext ctx;//ioc컨테이너

	   private MockMvc mockMvc;
	   /*
	   MockMvc란?
	   실제 객체와 비슷하지만 테스트에 필요한 기능만 가지는 가짜 객체를 만들어서
	   애플리케이션 서버에 배포하지 않고도 스프링 MVC 동작을 재현할 수 있는 클래스를 의미.
	   즉 컨트롤러를 테스트할 수있게 만든 가짜 객체(톰캣이 아닌 가상환경을 만들어서 테스트 진행)
	   */
	   @Before
	   public void setup() {
	      this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();//ioc컨테이너를 테스트
	   }
	   
	   //컨트롤 + shift + f 어노테이션 빨간줄 없애주기
	   @Test
	   public void testList() throws Exception {
		      mockMvc.perform(get("/list"))//겟방식으로 리스트르 ㄹ받는다.
		      .andExpect(status().isOk())//응답검증 200ok 서버??
		      .andDo(print())//print 뿌리는거. 
		      .andExpect(forwardedUrl("/WEB-INF/views/list.jsp")); //포워딩해서 가상환경에서 돌리는거. 
		      // 콘솔에 넘어오는걸 보고 확인해야한다.
		   }
	   
	   
	   @Test
	   public void testreply_view() throws Exception {
		      mockMvc.perform(get("/reply_view"))//겟방식으로 리스트르 ㄹ받는다.
		      .andExpect(status().isOk())//응답검증 200ok 서버??
		      .andDo(print())//print 뿌리는거. 
		      .andExpect(forwardedUrl("/WEB-INF/views/reply_view.jsp")); //포워딩해서 가상환경에서 돌리는거. 
		      // 콘솔에 넘어오는걸 보고 확인해야한다.
		   }
	   
	   
	   @Test
	   public void testcontent_view() throws Exception {
		      mockMvc.perform(get("/content_view"))//겟방식으로 리스트르 ㄹ받는다.
		      .andExpect(status().isOk())//응답검증 200ok 서버??
		      .andDo(print())//print 뿌리는거. 
		      .andExpect(forwardedUrl("/WEB-INF/views/content_view.jsp")); //포워딩해서 가상환경에서 돌리는거. 
		      // 콘솔에 넘어오는걸 보고 확인해야한다.
		   }
	   
	   
	   @Test
	   public void testwrite_view() throws Exception {
		      mockMvc.perform(get("/write_view"))//겟방식으로 리스트르 ㄹ받는다.
		      .andExpect(status().isOk())//응답검증 200ok 서버??
		      .andDo(print())//print 뿌리는거. 
		      .andExpect(forwardedUrl("/WEB-INF/views/write_view.jsp")); //포워딩해서 가상환경에서 돌리는거. 
		      // 콘솔에 넘어오는걸 보고 확인해야한다.
		   }
	   
	   

}

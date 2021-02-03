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


//��Ĺ�� �ٷ�� �κ��� �ƴϴ�. �׷��� ������ �׽�Ʈ �ϱ� ��ٷӴ� 

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j

public class BoardControllerTest {
	
	   @Setter(onMethod_ = { @Autowired })
	   private WebApplicationContext ctx;//ioc�����̳�

	   private MockMvc mockMvc;
	   /*
	   MockMvc��?
	   ���� ��ü�� ��������� �׽�Ʈ�� �ʿ��� ��ɸ� ������ ��¥ ��ü�� ����
	   ���ø����̼� ������ �������� �ʰ� ������ MVC ������ ������ �� �ִ� Ŭ������ �ǹ�.
	   �� ��Ʈ�ѷ��� �׽�Ʈ�� ���ְ� ���� ��¥ ��ü(��Ĺ�� �ƴ� ����ȯ���� ���� �׽�Ʈ ����)
	   */
	   @Before
	   public void setup() {
	      this.mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();//ioc�����̳ʸ� �׽�Ʈ
	   }
	   
	   //��Ʈ�� + shift + f ������̼� ������ �����ֱ�
	   @Test
	   public void testList() throws Exception {
		      mockMvc.perform(get("/list"))//�ٹ������ ����Ʈ�� ���޴´�.
		      .andExpect(status().isOk())//������� 200ok ����??
		      .andDo(print())//print �Ѹ��°�. 
		      .andExpect(forwardedUrl("/WEB-INF/views/list.jsp")); //�������ؼ� ����ȯ�濡�� �����°�. 
		      // �ֿܼ� �Ѿ���°� ���� Ȯ���ؾ��Ѵ�.
		   }
	   
	   
	   @Test
	   public void testreply_view() throws Exception {
		      mockMvc.perform(get("/reply_view"))//�ٹ������ ����Ʈ�� ���޴´�.
		      .andExpect(status().isOk())//������� 200ok ����??
		      .andDo(print())//print �Ѹ��°�. 
		      .andExpect(forwardedUrl("/WEB-INF/views/reply_view.jsp")); //�������ؼ� ����ȯ�濡�� �����°�. 
		      // �ֿܼ� �Ѿ���°� ���� Ȯ���ؾ��Ѵ�.
		   }
	   
	   
	   @Test
	   public void testcontent_view() throws Exception {
		      mockMvc.perform(get("/content_view"))//�ٹ������ ����Ʈ�� ���޴´�.
		      .andExpect(status().isOk())//������� 200ok ����??
		      .andDo(print())//print �Ѹ��°�. 
		      .andExpect(forwardedUrl("/WEB-INF/views/content_view.jsp")); //�������ؼ� ����ȯ�濡�� �����°�. 
		      // �ֿܼ� �Ѿ���°� ���� Ȯ���ؾ��Ѵ�.
		   }
	   
	   
	   @Test
	   public void testwrite_view() throws Exception {
		      mockMvc.perform(get("/write_view"))//�ٹ������ ����Ʈ�� ���޴´�.
		      .andExpect(status().isOk())//������� 200ok ����??
		      .andDo(print())//print �Ѹ��°�. 
		      .andExpect(forwardedUrl("/WEB-INF/views/write_view.jsp")); //�������ؼ� ����ȯ�濡�� �����°�. 
		      // �ֿܼ� �Ѿ���°� ���� Ȯ���ؾ��Ѵ�.
		   }
	   
	   

}

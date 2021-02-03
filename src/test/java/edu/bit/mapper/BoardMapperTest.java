package edu.bit.mapper;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.util.List;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.vo.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;

   
   @Test
   public void test() {
	   
	   
	 assertNotNull(boardMapper); //보드맵퍼에 null 값 확인
  
   }
   
   @Test
   public void testGetList() {
	   
	   List<BoardVO> list = boardMapper.getList();
	   
	   log.info(boardMapper);
   
	   for(BoardVO boardVO : list) {
		   log.info(boardVO.getbContent());
	   }
   }
	   @Test
	   public void testDelete() {
		   
		    boardMapper.delete(305);
	   
		    log.info(boardMapper);
	   
	   
	   

}
}
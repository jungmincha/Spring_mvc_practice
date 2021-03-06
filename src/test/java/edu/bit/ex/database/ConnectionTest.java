package edu.bit.ex.database;



import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ConnectionTest {

   @Inject
   DataSource dataSource; //Ŀ�ؼ�Ǯ üũ
   
   @Test
   public void testDataSource() {
      log.info("check connection" + dataSource);
      assertNotNull(dataSource);
      
   }
   
   
   

}

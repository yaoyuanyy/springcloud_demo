package com.yy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AppRun.class)
@WebAppConfiguration
@DirtiesContext
public class AppRunTests {

  @Autowired
  private Sink sink;

  @Test
  public void contextLoads() {
    //assertNotNull(this.sink.input());
	  System.out.println(this.sink.input());
  }
}

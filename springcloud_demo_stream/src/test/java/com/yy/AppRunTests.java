package com.yy;

import com.yy.component.KafkaSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = AppRun.class)
@DirtiesContext
public class AppRunTests {

  @Autowired
  private KafkaSender kafkaSender;

  @Test
  public void contextLoads() {
    //assertNotNull(this.sink.input());
    kafkaSender.sendMessage("hello");
  }
}

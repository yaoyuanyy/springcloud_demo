package com.yy.component;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * Description:
 * <p></p>
 * <pre></pre>
 * NB.
 * Created by skyler on 2018/6/22 at 上午7:15
 */
public interface Sink {

    //接收队列1
    String INPUT_1 = "sourceA";

    @Input(Sink.INPUT_1)
    SubscribableChannel input1();

}

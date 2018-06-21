package com.yy.component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 * <p></p>
 * <pre></pre>
 * NB.
 * Created by skyler on 2018/6/21 at 下午7:52
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Greetings {
    private long timestamp;
    private String message;
}


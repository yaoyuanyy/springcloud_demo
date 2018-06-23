package com.yy.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;

@Service
@Slf4j
public class GreetingsService {

    @Resource
    private GreetingsStreams greetingsStreams;

    public void sendGreeting(final Greetings greetings) {
        log.info("Sending greetings {}", greetings);
        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }

    @InboundChannelAdapter(value = GreetingsStreams.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public String sendInternal(){
        String nowDate = LocalDateTime.now().toString();
        System.out.println("sendInternal:" + nowDate);
        return nowDate;
    }
}

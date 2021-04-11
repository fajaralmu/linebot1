// 
//
//package com.fajar.linebot.app;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.linecorp.bot.model.event.Event;
//import com.linecorp.bot.model.event.MessageEvent;
//import com.linecorp.bot.model.event.message.TextMessageContent;
//import com.linecorp.bot.model.message.Message;
//import com.linecorp.bot.model.message.TextMessage;
//import com.linecorp.bot.spring.boot.annotation.EventMapping;
//import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;
//
//@SpringBootApplication
//@LineMessageHandler
//public class EchoApplicationTest {
//    private final Logger log = LoggerFactory.getLogger(EchoApplicationTest.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(EchoApplicationTest.class, args);
//    }
//    
//    public EchoApplicationTest() {
//    	System.out.println(":::::::::::: INITIALIZING EchoApplicationTest");
//    }
//
//    @EventMapping
//    public Message handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
//    	System.out.println("handleTextMessageEvent: " + event);
//        final String originalMessageText = event.getMessage().getText();
//        return new TextMessage(originalMessageText);
//    }
//
//    @EventMapping
//    public void handleDefaultMessageEvent(Event event) {
//        System.out.println("handleDefaultMessageEvent: " + event);
//    }
//}

package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;

import com.example.demo.print.PrintService;

@SpringBootApplication
@Configuration
@ImportResource("integration-context.xml")
public class SpringIntegrationApplication implements ApplicationRunner {

	@Autowired
	private DirectChannel channel1;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key", "value");
		MessageHeaders header=new MessageHeaders(map);
		Message<String> message=new GenericMessage<String>("Hello world",header);
		PrintService service = new PrintService();
		service.print(message);
		
		Message<String> message2=MessageBuilder.withPayload("Hello from Builder").setHeader("key2","value2").build();
		//service.print(message2);
		
		channel1.subscribe(new MessageHandler(){

			@Override
			public void handleMessage(Message<?> message) throws MessagingException {
				// TODO Auto-generated method stub
				service.print((Message<String>) message);
			}});
		
		channel1.send(message2);
		
		
		
	}
}

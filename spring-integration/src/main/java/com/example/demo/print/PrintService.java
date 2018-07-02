package com.example.demo.print;

import java.util.Map.Entry;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

public class PrintService {
	
	public void print(Message<String> message){
		System.out.println(message.getHeaders());
		MessageHeaders headers=message.getHeaders();
		
		for (Entry<String,Object> e: headers.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());	
			
			
		}
		
		System.out.println(message.getPayload());
		
		
	}

}

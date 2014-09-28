package com.sarf.jms;

import com.sarf.data.MessageObject;

public class MessageConsumerBean {
		
	public String onMessage(MessageObject message) {
		  try {
			System.out.println("Mail # "+message.getMessage()+" received.");
		} catch (Exception e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}
		  return message.getMessage();
	}
}

package com.sarf.jms;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class MessageConsumerBean implements MessageListener {
	public void onMessage(Message message) {
		MapMessage mapMessage = (MapMessage) message;
		try {
			String strEmail = mapMessage.getString("mailId");
			System.out.println("Mail #" + strEmail + " received.");
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}

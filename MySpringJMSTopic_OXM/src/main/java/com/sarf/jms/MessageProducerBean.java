package com.sarf.jms;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.support.JmsGatewaySupport;

public class MessageProducerBean extends JmsGatewaySupport{
 	
	public void sendMessage(final String myMessage) {
		 getJmsTemplate().send(new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
			         BytesMessage message = session.createBytesMessage();
			         message.writeBytes(myMessage.getBytes());
		             return message;
				}
			});
		}
}

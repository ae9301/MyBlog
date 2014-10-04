package com.sarf.jms;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.core.support.JmsGatewaySupport;

import com.sarf.data.MessageObject;

public class MessageProducerBean extends JmsGatewaySupport {
	public void sendMessage(final MessageObject messageObj) {
		getJmsTemplate().send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				MapMessage message = session.createMapMessage();
				message.setString("mailId", messageObj.getMailId());
				message.setString("message", messageObj.getMessage());
				return message;
			}
		});
	}
}
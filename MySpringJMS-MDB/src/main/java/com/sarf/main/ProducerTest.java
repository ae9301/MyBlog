package com.sarf.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarf.data.MessageObject;
import com.sarf.jms.MessageProducerBean;

public class ProducerTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"appContext.xml");
		MessageProducerBean mp = (MessageProducerBean) context
				.getBean("producer");
		mp.sendMessage(new MessageObject("34", "Test Message"));
	}
}
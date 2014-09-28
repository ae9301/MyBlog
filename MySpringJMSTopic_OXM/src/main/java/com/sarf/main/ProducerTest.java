package com.sarf.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarf.jms.MessageProducerBean;


public class ProducerTest {   
	 public static void main(String[] args) {
	        ApplicationContext context =
	            new ClassPathXmlApplicationContext("appProdContext.xml");
	        MessageProducerBean mp = (MessageProducerBean) context.getBean("producer");
	        String msg = "<MessageObject><mailId>skhan</mailId>"
	        		+ "<message>Hello Topic!</message></MessageObject>";
	        mp.sendMessage(msg);
	        System.out.println("Message sent to destination");
	      } 

}
 
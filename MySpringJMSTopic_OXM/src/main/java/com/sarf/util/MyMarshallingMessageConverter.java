package com.sarf.util;

import javax.jms.JMSException;
import javax.jms.Message;

import org.springframework.jms.support.converter.MarshallingMessageConverter;
import org.springframework.jms.support.converter.MessageConversionException;

public class MyMarshallingMessageConverter extends MarshallingMessageConverter {
	   @Override
	  public Object fromMessage(Message message) throws JMSException, MessageConversionException{
	       return super.fromMessage(message);
	    
	  }

}

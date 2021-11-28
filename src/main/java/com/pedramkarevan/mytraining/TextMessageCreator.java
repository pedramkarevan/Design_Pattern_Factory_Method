package com.pedramkarevan.mytraining;


import com.pedramkarevan.mytraining.message.Message;
import com.pedramkarevan.mytraining.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}

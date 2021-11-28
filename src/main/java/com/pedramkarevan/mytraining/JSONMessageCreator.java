package com.pedramkarevan.mytraining;


import com.pedramkarevan.mytraining.message.JSONMessage;
import com.pedramkarevan.mytraining.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}

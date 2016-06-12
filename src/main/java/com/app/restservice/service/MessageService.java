package com.app.restservice.service;

import java.util.ArrayList;
import java.util.List;

import com.app.restservice.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1, "Message 1", "shashank");
		Message m2 = new Message(1, "Message 2", "shashank");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}
}

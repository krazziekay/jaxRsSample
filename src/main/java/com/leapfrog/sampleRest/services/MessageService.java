package com.leapfrog.sampleRest.services;

import com.leapfrog.sampleRest.database.DatabaseClass;
import com.leapfrog.sampleRest.models.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 Created by kay on 4/3/17.
 */
public class MessageService {

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {
        messages.put(1L, new Message(1, "First message", "First author"));
    }

    public List<Message> getAllMessages() {
       return new ArrayList<>(messages.values());
    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(messages.size() + 1);
        messages.put((long)message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message) {
        if(message.getId() <= 0) {
            return null;
        }
        messages.put((long) message.getId(), message);
        return message;
    }

    public Message removeMessage(long id) {
        return messages.remove(id);
    }

}

package com.leapfrog.sampleRest.database;

import com.leapfrog.sampleRest.models.Message;

import java.util.HashMap;
import java.util.Map;

/*
  Created by kay on 4/4/17.
 */
public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();



    public static Map<Long, Message> getMessages() {
        return messages;
    }

}

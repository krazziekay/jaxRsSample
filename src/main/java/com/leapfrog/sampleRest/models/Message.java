package com.leapfrog.sampleRest.models;


import org.glassfish.jersey.server.JSONP;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/*
 Created by kay on 4/3/17.
 */


public class Message {
    private int id;
    private String message;
    private Date created;
    private String author;

    public Message() {
    }

    public Message(int id, String message, String author) {
        this.id = id;
        this.message = message;
        this.created = new Date();
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

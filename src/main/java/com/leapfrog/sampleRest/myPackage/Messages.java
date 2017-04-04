package com.leapfrog.sampleRest.myPackage;

import com.leapfrog.sampleRest.models.Message;
import com.leapfrog.sampleRest.services.MessageService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/*
 Created by kay on 4/3/17.
 */
@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Messages {

    MessageService messageService = new MessageService();

    @GET
    public List<Message> getMessages() {
        return messageService.getAllMessages();
    }

    @POST
    public Message addMessage(Message message) {
        return messageService.addMessage(message);
    }

    @PUT
    @Path("/{messageId}")
    public Message updateMessage(@PathParam("messageId") int messageId, Message message) {
        message.setId(messageId);
        return messageService.updateMessage(message);
    }

    @DELETE
    @Path("/{messageId}")
    public Message deleteMessage(@PathParam("messageId") int messageId) {
        return messageService.removeMessage(messageId);
    }

    @GET
    @Path("/{messageId}")
    public Message getMessage(@PathParam("messageId") int messageId) {
        return messageService.getMessage(messageId);
    }
}

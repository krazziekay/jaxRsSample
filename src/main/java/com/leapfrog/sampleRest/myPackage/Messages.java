package com.leapfrog.sampleRest.myPackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by kay on 4/3/17.
 */
@Path("/messages")
public class Messages {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessages() {
        return "THis is it!";
    }
}

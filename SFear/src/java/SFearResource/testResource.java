/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 * REST Web Service
 *
 * @author fjcamillo
 */
@Path("/test")
//@Consumes("application/json")
public class testResource {
    
    String ans = "ok";
    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of testResource
     */
    public testResource() {
    }

    /**
     * Retrieves representation of an instance of SFearResource.testResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "{\"result\":"+ans.toString()+"}";
//        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of testResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        try {
            System.out.println(content);
            JSONObject conts = new JSONObject(content);
            String change = (String) conts.get("change");
            ans = change;
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    
}

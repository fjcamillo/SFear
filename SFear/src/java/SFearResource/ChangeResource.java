/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author fjcamillo
 */
public class ChangeResource {

    /**
     * Creates a new instance of ChangeResource
     */
    private ChangeResource() {
        
    }

    /**
     * Get instance of the ChangeResource
     */
    public static ChangeResource getInstance() {
        // The user may use some kind of persistence mechanism
        // to store and restore instances of ChangeResource class.
        return new ChangeResource();
    }

    /**
     * Retrieves representation of an instance of SFearResource.ChangeResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of ChangeResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    /**
     * DELETE method for resource ChangeResource
     */
    @DELETE
    public void delete() {
    }
}

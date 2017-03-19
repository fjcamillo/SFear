/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
//import org.json.


/**
 * REST Web Service
 *
 * @author fjcamillo
 */
@Path("/changes")
public class ChangesResource {
    
    variableholder var = new variableholder();
//    data = 
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ChangesResource
     */
    public ChangesResource() {
    }

    /**
     * Retrieves representation of an instance of SFearResource.ChangesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        return "{\"pay\":\""+var.getans()+"\"}";
//        throw new UnsupportedOperationException();
    }
    
    /**
     * POST method for creating an instance of ChangeResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public variableholder postJson  (variableholder var){
        return var;
    }
    
//    @Produces("text/json")
//    public Response postJson(String content) {
//        //TODO
//        return Response.created(context.getAbsolutePath()).build();
//    }

    /**
     * Sub-resource locator method for /change
     */
    @Path("/change")
    public ChangeResource getChangeResource() {
        return ChangeResource.getInstance();
    }
}

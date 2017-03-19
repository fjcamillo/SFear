/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;
import SFearResource.holder;
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
import java.util.ArrayList;
//import org.json.

/**
 * REST Web Service
 *
 * @author fjcamillo
 */
@Path("/changes")
public class ChangesResource {
    
    private IProcess service;
//    ArrayList<variableholder> varters = holder.getVar();
    private String bulb = holder.getBulb();
//    private String x = varters.get(0);
//    variableholder x = varters.get(0);
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
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
//        return "{\"pay\":\""+var.getans()+"\"}";
        return "{\"pay\":\""+bulb+"\"}";
//        throw new UnsupportedOperationException();
    }
    
    /**
     * POST method for creating an instance of ChangeResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Path("/post")
    @Consumes("application/json")   
    @Produces("application/json")
    public Response postJson(String obj) {
        //TODO
        
        Response responseWS = null;
        JSONObject response = new JSONObject();
        
//        service = 
//        variableholder var = new variableholder();
//        service = FacultyStudentServiceFactory.getService(Constants.ServiceCode.VALIDATE_ACCOUNT.toString());
        try {
//            var.setans(obj);
//            varters.get(0).set(0, obj);
            holder.setBulb(obj);
            responseWS = Response.status(200).entity(response.toString()).build();
        } catch (Exception e) {
            responseWS = Response.status(200).entity(response.toString()).build();
        }
        
        return responseWS;
    }

    /**
     * Sub-resource locator method for /change
     */
    @Path("/change")
    public ChangeResource getChangeResource() {
        return ChangeResource.getInstance();
    }
}

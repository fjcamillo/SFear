/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;
import SFearResource.houselights;
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
import java.util.ArrayList;
import org.json.JSONObject;
import java.io.FileInputStream;
import java.io.File;
import java.io.InputStream;

/**
 * REST Web Service
 *
 * @author fjcamillo
 */
@Path("/houses")
public class HousesResource {
    
    private String kitchenBulb = houselights.getKitchenBulb();
    private String livingBulb = houselights.getLivingBulb();
    private String bedroomBulb = houselights.getBedRoomBulb();
    private String crBulb = houselights.getCRBulb();
    
    private static String directory = "/home/fjcamillo/Desktop/SFear/Initial Front End/sfear v2.0/index.html";
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HousesResource
     */
    public HousesResource() {
    }
    
    public String[] splitter(String obj){
//        ArrayList<String> x = new ArrayList<String>();
//        x = ;
        String x[] = obj.split(" ");
        return x;
    
    }

    /**
     * Retrieves representation of an instance of SFearResource.HousesResource
     * @return an instance of java.lang.String
     */
    
//    @GET
//    @Path("/main")
//    @Produces({MediaType.TEXT_HTML})
//    public InputStream viewMain() {
//        //TODO return proper representation object
////        return "hi";
//        
//        
////        FileInputSream g = new FileInputStream(f);
//        try{
//            File f = new File(directory);
//            
////            return new FileInputStream(f);
//        } catch (Exception e) {
//            
//        }
////        return new FileInputStream(f);
////        throw new UnsupportedOperationException();
//    }
    
    @GET
    @Path("/get/kitchen")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJsonKitchen() {
        //TODO return proper representation object
//        return "hi";
        String half = "{\"data\":\"0 "+kitchenBulb+"\"}";
        return half;
//        throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("/get/living")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJsonLiving() {
        //TODO return proper representation object
        String half = "{\"data\":\"1 "+livingBulb+"\"}";
        return half;
//        throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("/get/bedroom")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJsonBedRoom() {
        //TODO return proper representation object
        String half = "{\"data\":\"2 "+bedroomBulb+"\"}";
        return half;
//        throw new UnsupportedOperationException();
    }
    
    @GET
    @Path("/get/cr")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJsonCR() {
        //TODO return proper representation object
        String half = "{\"data\":\"3 "+crBulb+"\"}";
        return half;
//        throw new UnsupportedOperationException();
    }

    /**
     * POST method for creating an instance of HouseResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Path("/post/kitchen")
    @Consumes("application/json")
    @Produces("application/json")
    public Response postJsonKitchen(String content) {
        Response responseWS = null;
        JSONObject response = new JSONObject();
        //TODO
        try {
            houselights.setKitchenBulb(content);
            responseWS = Response.status(200).entity(response.toString()).build();
        } catch (Exception e) {
            responseWS = Response.status(200).entity(response.toString()).build();
        }
            
            
        return responseWS;
    }
    
    @POST
    @Path("/post/living")
    @Consumes("application/json")
    @Produces("application/json")
    public Response postJsonLiving(String content) {
        Response responseWS = null;
        JSONObject response = new JSONObject();
        //TODO
        try {
            houselights.setLivingBulb(content);
            responseWS = Response.status(200).entity(response.toString()).build();
        } catch (Exception e) {
            responseWS = Response.status(200).entity(response.toString()).build();
        }
            
            
        return responseWS;
    }
    
    @POST
    @Path("/post/bedroom")
    @Consumes("application/json")
    @Produces("application/json")
    public Response postJsonBedRoom(String content) {
        Response responseWS = null;
        JSONObject response = new JSONObject();
        //TODO
        try {
            houselights.setBedRoomBulb(content);
            responseWS = Response.status(200).entity(response.toString()).build();
        } catch (Exception e) {
            responseWS = Response.status(200).entity(response.toString()).build();
        }
            
            
        return responseWS;
    }
    
    @POST
    @Path("/post/cr")
    @Consumes("application/json")
    @Produces("application/json")
    public Response postJsonCR(String content) {
        Response responseWS = null;
        JSONObject response = new JSONObject();
        //TODO
        try {
            houselights.setCRBulb(content);
            responseWS = Response.status(200).entity(response.toString()).build();
        } catch (Exception e) {
            responseWS = Response.status(200).entity(response.toString()).build();
        }
            
            
        return responseWS;
    }

    /**
     * Sub-resource locator method for /house
     */
    @Path("/house")
    public HouseResource getHouseResource() {
        return HouseResource.getInstance();
    }
}

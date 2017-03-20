/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SFearResource;
import SFearResource.cozynaholder;
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

/**
 * REST Web Service
 *
 * @author fjcamillo
 */
@Path("/restaurants")
public class RestaurantsResource {

    private static sit1 = cozynaholder.getsit1();
    private static sit2 = cozynaholder.getsit2();
    private static sit3 = cozynaholder.getsit3();
    private static sit4 = cozynaholder.getsit4();
    private static sit5 = cozynaholder.getsit5();
    private static sit6 = cozynaholder.getsit6();
    private static sit7 = cozynaholder.getsit7();
    private static sit8 = cozynaholder.getsit8();
    private static sit9 = cozynaholder.getsit9();
    private static sit10 = cozynaholder.getsit10();
    private static sit11 = cozynaholder.getsit11();
    private static sit12 = cozynaholder.getsit12();
    private static sit13 = cozynaholder.getsit13();
    private static sit14 = cozynaholder.getsit14();
    private static sit15 = cozynaholder.getsit15();
    private static sit16 = cozynaholder.getsit16();
    private static sit17 = cozynaholder.getsit17();
    

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestaurantsResource
     */
    public RestaurantsResource() {
    }

    /**
     * Retrieves representation of an instance of SFearResource.RestaurantsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/get/1")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson1() {
        //TODO return proper representation object
        return sit1;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/2")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson2() {
        //TODO return proper representation object
        return sit2;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/3")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson3() {
        //TODO return proper representation object
        return sit3;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/4")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson4() {
        //TODO return proper representation object
        return sit1;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/5")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson5() {
        //TODO return proper representation object
        return sit5;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/6")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson6() {
        //TODO return proper representation object
        return sit6;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/7")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson7() {
        //TODO return proper representation object
        return sit7;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/8")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson8() {
        //TODO return proper representation object
        return sit8;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/9")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson9() {
        //TODO return proper representation object
        return sit9;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/10")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson10() {
        //TODO return proper representation object
        return sit10;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/11")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson11() {
        //TODO return proper representation object
        return sit11;
        // throw new UnsupportedOperationException();
    }


    @GET
    @Path("/get/12")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson12() {
        //TODO return proper representation object
        return sit12;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/13")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson13() {
        //TODO return proper representation object
        return sit13;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/14")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson14() {
        //TODO return proper representation object
        return sit14;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/15")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson15() {
        //TODO return proper representation object
        return sit15;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/16")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson16() {
        //TODO return proper representation object
        return sit16;
        // throw new UnsupportedOperationException();
    }

    @GET
    @Path("/get/17")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson17() {
        //TODO return proper representation object
        return sit17;
        // throw new UnsupportedOperationException();
    }

    
    /**
     * POST method for creating an instance of RestaurantResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Path("/post/1")
    @Consumes("application/json")
    @Produces("application/json")
    public Response postJson(String content) {
        //TODO
        // return Response.created(context.getAbsolutePath()).build();

        Response responseWS = null;
        JSONObject response = new JSONObject();
    }

    /**
     * Sub-resource locator method for /restaurant
     */
    @Path("/restaurant")
    public RestaurantResource getRestaurantResource() {
        return RestaurantResource.getInstance();
    }
}

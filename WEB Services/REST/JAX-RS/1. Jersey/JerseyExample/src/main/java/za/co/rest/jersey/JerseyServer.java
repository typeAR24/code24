package za.co.rest.jersey;


import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.net.URI;

@Path("/myService")
public class JerseyServer {


    String loginMessage;


    @GET
    @Path("/specifyParameterNames")
    @Produces(MediaType.APPLICATION_JSON) //determines how should responce brought back as.
    public Response specifyParameterNamesAndValues(@QueryParam("user_name")String username, @QueryParam("password") String password){

        if (username.equals("adolph") && password.equals("abc1233")){
            loginMessage = "Login successfully";
        }else {
            loginMessage = "Incorect user or password";
        }

        return Response.status(200).entity(loginMessage).build();
    }

    @GET
    @Path("/specifyValuesOnly/{user_name}/{password}")
    @Produces(MediaType.APPLICATION_JSON) //determines how should responce brought back as.
    public Response specifyOnlyValues(@PathParam("user_name") String username, @PathParam("password") String password){

        if (username.equals("adolph") && password.equals("abc1233")){
            loginMessage = "Login successfully";
        }else {
            loginMessage = "Incorect user or password";
        }

        return Response.status(200).entity(loginMessage).build();
    }


}





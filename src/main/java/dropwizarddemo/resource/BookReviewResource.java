package dropwizarddemo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.Date;

@Path("/book")
public class BookReviewResource {

    @GET
    @Path("/healthCheck")
    public String getHealthCheck(){
        return "Ping received at " + new Date();
    }

    @POST
    @Path("/healthCheck")
    public String postHealthCheck(){
        return "Posted";
    }
}

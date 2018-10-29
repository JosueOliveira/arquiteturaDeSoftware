package teste;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("/produto")
public class SimpleService {
 
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getSimpleProduct() {
         return "IPad";
  
    }
     
}
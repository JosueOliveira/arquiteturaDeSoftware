package teste;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

//@Path("api/livros")
public class LivroREST{

    private LivroBC bc = new LivroBC();   

    @GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Livro> find(@QueryParam("q") String query) throws Exception {
    	if(bc.find(null).size()==0) {
    		bc.load();
    	}
        return bc.find(query);
    }

    @GET
    @Path("{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    public Livro load(@PathParam("id") int id) throws Exception {
    	if(bc.find(null).size()==0) {
    		bc.load();
    	}
    	
    	Livro result = bc.find("").get(id);

        if (result == null) {
            throw new NotFoundException();
        }

        return result;
    }

    @POST
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response insert(Livro livro, @Context UriInfo uriInfo) throws Exception {
       

        String id = ""+bc.salvar(livro).getId();
        URI location = uriInfo.getRequestUriBuilder().path(id).build();

        return Response.created(location).entity(id).build();
    }

    @PUT
    @Path("{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public void update(@PathParam("id") int id, Livro livro) throws Exception {

        livro.setId(id);
        bc.salvar(livro);
    }

    @DELETE
    @Path("{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({ MediaType.APPLICATION_JSON })
    public void delete(@PathParam("id") Long id) throws Exception {
        
    }

   
    }


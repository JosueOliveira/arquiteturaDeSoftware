package br.up.edu.arquitetura.biblioteca.rest;

 
import java.net.URI;
 
import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Livro;
 
import br.up.edu.arquitetura.biblioteca.modelo.negocio.LivroNegocio;

@Path("api/livros") 
public class LivroRest {

	private LivroNegocio bc = new LivroNegocio(); 
	
	@GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Livro> find(@QueryParam("q") String query) throws Exception {
    	 
		bc.Load();
        return bc.listarTodos();
    }
	
	 @GET
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 public Livro load(@PathParam("id") int id) throws Exception {
	    	 
	    	
	    	Livro result = bc.findByKey(id);

	        if (result == null) {
	            throw new NotFoundException();
	        }

	        return result;
	 } 
	
	 
	 @POST
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public Response insert(Livro livro, @Context UriInfo uriInfo) throws Exception {
	       

	        String id = ""+bc.cadastra(livro).getId();
	        URI location = uriInfo.getRequestUriBuilder().path(id).build();

	        return Response.created(location).entity(id).build();
	 }
	 
	 @PUT
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public void update(@PathParam("id") int id, Livro livro) throws Exception {

	        livro.setId(id);
	        bc.Atualizar(livro);
	 }
	 
	 @DELETE
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public void delete(@PathParam("id") Long id) throws Exception {
	       
	    
	 }

	   
	    
  
}

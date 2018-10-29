package br.up.edu.arquitetura.biblioteca.rest;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Autor;
 
import br.up.edu.arquitetura.biblioteca.modelo.negocio.AutorNegocio;
 
@Path("api/autores")
public class AutorRest {

	private AutorNegocio bc = new AutorNegocio();
	
	 @GET
	 @Produces({ MediaType.APPLICATION_JSON })
	 public List<Autor> find(@QueryParam("q") String id) throws Exception {		 
		 bc.Load();		 
	     return bc.listarTodos();
	 }
	
	 @GET
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 public Autor load(@PathParam("id") int id) throws Exception {
	 
	   	Autor result = bc.findByKey(id);

	        if (result == null) {
	            throw new NotFoundException();
	        }

	     return result;
	 }
	   
	  
	 @POST
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public Response insert(Autor autor, @Context UriInfo uriInfo) throws Exception {
	       

	        String id = ""+bc.cadastra(autor).getId();
	        URI location = uriInfo.getRequestUriBuilder().path(id).build();

	        return Response.created(location).entity(id).build();
	 }   

  
	 @PUT
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public void update(@PathParam("id") int id, Autor autor) throws Exception {

	        autor.setId(id);
	        bc.Atualizar(autor);
	 }
	  
	  
}

package br.up.edu.arquitetura.biblioteca.rest;

import java.net.URI;
import java.util.ArrayList;

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
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Mutuario;
import br.up.edu.arquitetura.biblioteca.modelo.negocio.MutuarioNegocio;;

@Path("api/mutuarios")
public class MutuarioRest {

	private MutuarioNegocio bc = new MutuarioNegocio();
	  
	@GET 
	@Produces({MediaType.APPLICATION_JSON})
	 public ArrayList<Mutuario> find (@QueryParam("q") String query)throws Exception{  
		bc.load();
		
		 return bc.listarTodos();
	 }
	   
	  
	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Mutuario load(@PathParam("id") int id) throws Exception {
	 
	   	Mutuario result = bc.findByKey(id);

	        if (result == null) {
	            throw new NotFoundException();
	        }

	     return result;
	}
	
	 
	 @POST
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public Response insert(Mutuario mutuario, @Context UriInfo uriInfo) throws Exception {
	       

	        String id = ""+bc.cadastra(mutuario).getId();
	        URI location = uriInfo.getRequestUriBuilder().path(id).build();

	        return Response.created(location).entity(id).build();
	 }   

  
	 @PUT
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public void update(@PathParam("id") int id, Mutuario mutuario) throws Exception {

	        mutuario.setId(id);
	        bc.Atualizar(mutuario);
	 }
	 
	 
}

package br.up.edu.arquitetura.biblioteca.rest;

import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
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

 
import br.up.edu.arquitetura.biblioteca.modelo.dominio.Emprestimo;
import br.up.edu.arquitetura.biblioteca.modelo.negocio.EmprestimoNegocio;
 
 

@Path("api/emprestimos")
public class EmprestimoRest {

	private EmprestimoNegocio bc = new EmprestimoNegocio();
	
	 @GET
	 @Produces({ MediaType.APPLICATION_JSON })
	 public List<Emprestimo> find(@QueryParam("q") String id) throws Exception {
	         
	        return bc.listarTodos();
	 }
	 
	 @GET
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 public Emprestimo load(@PathParam("id") int id) throws Exception {
	 
	   	Emprestimo result = bc.findByKey(id);

	        if (result == null) {
	            throw new NotFoundException();
	        }

	     return result;
	 }
	 
	 @POST
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public Response insert(Emprestimo emprestimo, @Context UriInfo uriInfo) throws Exception { 
		 	String id = "";
		    if(emprestimo.getDataDevolucao() != null) {
		    	id += bc.devolverLivro(emprestimo).getId();
		    }else
		    {
		    	id += bc.emprestar(emprestimo).getId();
		    }
	        URI location = uriInfo.getRequestUriBuilder().path(id).build();

	        return Response.created(location).entity(id).build();
	 }  
	 
	 
	 
	 @PUT
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public void update(@PathParam("id") int id, Emprestimo emprestimo) throws Exception {

	        emprestimo.setId(id);
	        bc.renovarEmprestimo(emprestimo);
	 }
	 
	 @DELETE
	 @Path("{id}")
	 @Produces({ MediaType.APPLICATION_JSON })
	 @Consumes({ MediaType.APPLICATION_JSON })
	 public void delete(@PathParam("id") int id, Emprestimo emprestimo) throws Exception {
	       System.out.println("chegou"); 
	 }
	  
}

package br.inatel.dm110.calc.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/rest")
public interface CalcService {

	@GET
	@Path("/calc/sum")
	@Produces(MediaType.APPLICATION_JSON)
	ResultCalc sum(@QueryParam("first") int first, @QueryParam("last") int last);
	
	@POST
	@Path("/calc/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	ResultCalc subtract(@FormParam("first") int first, @FormParam("last") int last);
	
	
}

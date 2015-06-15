package co.edu.uniandes.migrana.service;

import co.edu.uniandes.migrana.dap.UsuarioDataAccess;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("serviceUser")
public class UsuarioFacadeREST {

	@GET	
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsersSystem() throws Exception{

		Response response = null;
		try{		
                        response = Response.ok(UsuarioDataAccess.GetUsuarios()).build();
		}
		catch(Exception ex){
			response = Response.status(500).entity(ex.toString()).build();
		}
		finally{
//                    if(conn != null)
//                        conn.close();
//                    if (query != null)
//                        query.close();
//                    if (rs != null)
//                        rs.close();
		}
		
		return response;
	}	
	
}

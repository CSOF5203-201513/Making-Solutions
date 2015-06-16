package co.edu.uniandes.migrana.service;

import co.edu.uniandes.migrana.dap.UsuarioDataAccess;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
        
        @GET	
	@Path("/getUserById/{Id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam ("numeroIdentificacion") String numeroIdentificacion) throws Exception{        
            Response response = null;
		try{		
                        response = Response.ok(UsuarioDataAccess.GetUsuariosById(numeroIdentificacion)).build();
		}
		catch(Exception ex){
			response = Response.status(500).entity(ex.toString()).build();
		}
		finally{

		}
		
		return response;            
        }
        
	@POST
	@Path("/insertUser")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_JSON})	
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertUser(String incomingData) throws Exception{
            Response response = null;
            try{		
                UsuarioDataAccess.insertUser(incomingData);    
                response = Response.ok("Ok").build();
            }
            catch(Exception ex){
                    response = Response.status(500).entity(ex.toString()).build();
            }
            finally{

            }		
            return response;                        
        }   
        
	@PUT
	@Path("/updateUserById")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED,MediaType.APPLICATION_JSON})	
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateUserById(String incomingData) throws Exception{		
		
            Response response = null;
            try{		
                UsuarioDataAccess.updateUser(incomingData);    
                response = Response.ok("Ok").build();
            }
            catch(Exception ex){
                    response = Response.status(500).entity(ex.toString()).build();
            }
            finally{

            }		
            return response;              
        }
	
}

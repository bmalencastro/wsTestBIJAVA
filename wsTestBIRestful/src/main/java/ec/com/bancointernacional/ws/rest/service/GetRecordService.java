package ec.com.bancointernacional.ws.rest.service;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ec.com.bancointernacional.ws.rest.model.TransactionRequest;
import ec.com.bancointernacional.ws.rest.model.TransactionResponse;
import ec.com.bancointernacional.ws.rest.util.Constantes;
import ec.com.bancointernacional.ws.rest.util.RestUtil;

@Path("/transaction")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
public class GetRecordService {	
	ObtenerRegistroServiceImpl obtenerRegistroService = new ObtenerRegistroServiceImpl();
	
	@POST
	@Path("/obtenerRegistroUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public TransactionResponse obtenerRegistroUsuario(TransactionRequest request) {
		TransactionResponse response = RestUtil.validateInput(request);
		if(Constantes.RESPONSE_CODE_OK.compareTo(response.getMensajeCodigo()) == 0) {
			response = obtenerRegistroService.obtenerRegistroUsuario(request);
		}
		return response;
	}
}

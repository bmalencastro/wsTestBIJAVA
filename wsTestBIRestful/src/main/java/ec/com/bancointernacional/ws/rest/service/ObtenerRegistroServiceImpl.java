package ec.com.bancointernacional.ws.rest.service;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import ec.com.bancointernacional.ws.rest.model.TransactionRequest;
import ec.com.bancointernacional.ws.rest.model.TransactionResponse;
import ec.com.bancointernacional.ws.rest.util.Constantes;
import ec.com.bancointernacional.ws.rest.util.RestUtil;
import ec.com.bancointernacional.ws.rest.vo.VOUsuario;

@Stateless
public class ObtenerRegistroServiceImpl implements ObtenerRegistroService {
	private static final Logger LOG = Logger.getLogger(ObtenerRegistroServiceImpl.class);
	
	@Override
	public TransactionResponse obtenerRegistroUsuario(TransactionRequest request) {
		LOG.info("Inicia la transaccion.");
		TransactionResponse response = new TransactionResponse(Constantes.RESPONSE_CODE_OK, Constantes.RESPONSE_MESSAGE_OK);
		if(Constantes.SIZE_USER_ID.compareTo(request.getUserId().length()) == 0) {
			VOUsuario usuario = RestUtil.obtenerDesdeCSV(request.getUserId());
			if(null != usuario) {
				response.setUsuario(usuario);
				if(usuario.getLstMovimiento().size() > 0) {
					response.setSaldoActual(RestUtil.calcularSaldoActual(usuario.getLstMovimiento()));
				}
			} else {
				response = new TransactionResponse(Constantes.RESPONSE_CODE_9000, Constantes.RESPONSE_MESSAGE_9000);
				LOG.error("Error al obtener la informacion.");
			}
		} else {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "USUARIO");
		}
		return response;
	}

}

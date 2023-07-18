package ec.com.bancointernacional.ws.rest.service;

import javax.ejb.Local;

import ec.com.bancointernacional.ws.rest.model.TransactionRequest;
import ec.com.bancointernacional.ws.rest.model.TransactionResponse;

@Local
public interface ObtenerRegistroService {
	public TransactionResponse obtenerRegistroUsuario(TransactionRequest request);
}

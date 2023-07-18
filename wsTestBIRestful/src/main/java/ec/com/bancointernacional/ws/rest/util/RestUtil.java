package ec.com.bancointernacional.ws.rest.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ec.com.bancointernacional.ws.rest.model.TransactionRequest;
import ec.com.bancointernacional.ws.rest.model.TransactionResponse;
import ec.com.bancointernacional.ws.rest.vo.VOMovimiento;
import ec.com.bancointernacional.ws.rest.vo.VOUsuario;

public class RestUtil {
	private static final Logger LOG = Logger.getLogger(RestUtil.class);
	private static final String EMPTY = "";
	
	public static TransactionResponse validateInput(TransactionRequest request) {
		TransactionResponse response = new TransactionResponse(Constantes.RESPONSE_CODE_OK, Constantes.RESPONSE_MESSAGE_OK);
		if(null == request.getHeader()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "header");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "ipAddress");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "channel");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "customerId");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "sequential");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "dateAndTime");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "userId");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "productCode");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "tranServiceCode");
		} else if (null == request.getHeader().getIpAddress()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "groupId");
		} else if (null == request.getUserId()) {
			response = new TransactionResponse(Constantes.RESPONSE_CODE_9001, Constantes.RESPONSE_MESSAGE_9001 + "USUARIO");
		}
		return response;
	}
	
	public static VOUsuario obtenerDesdeCSV(String identificador) {
		VOUsuario registro = null;
		String csvFile = Constantes.DATA_PATH + Constantes.DATA_USUARIO_CSV;
        String delimitador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimitador);
                String currentIdentifier = data[0];

                if (currentIdentifier.equals(identificador)) {
                    LOG.info("Línea encontrada: " + line);
                    registro = new VOUsuario();
                    registro.setId(data[0]);
                    registro.setNombre(data[1]);
                    registro.setApellido(data[2]);
                    registro.setEdad(Integer.parseInt(data[3]));
                    registro.setCuenta(data[4]);
                    registro.setTipo(data[7]);
                    if(Constantes.CODE_CLIENTE.equals(registro.getTipo())) {
                    	registro.setFechaCreacion(data[5]);
                        registro.setCargo(null);
                    } else if(Constantes.CODE_EMPLEADO.equals(registro.getTipo())) {
                    	registro.setFechaCreacion(null);
                        registro.setCargo(data[6]);
                    } else {
                    	registro.setFechaCreacion(null);
                        registro.setCargo(null);
                    }
                    registro.setLstMovimiento(obtenerMovimientoDesdeCSV(registro.getCuenta()));
                    break;
                }
            }
        } catch (IOException e) {
        	LOG.error("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        
        return registro;
	}
	
	private static List<VOMovimiento> obtenerMovimientoDesdeCSV(String identificador) {
		VOMovimiento movimiento = null;
		List<VOMovimiento> lstMovimientos = new ArrayList<>();
		String csvFile = Constantes.DATA_PATH + Constantes.DATA_MOVIMIENTO_CSV;
        String delimitador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimitador);
                String currentIdentifier = data[0];

                if (currentIdentifier.equals(identificador)) {
                	movimiento = new VOMovimiento();
                	movimiento.setCuenta(data[0]);
                	movimiento.setId(data[1]);
                	if(Constantes.CODE_CREDITO.equals(data[2])) {
                		movimiento.setTipo(Constantes.CODE_CREDITO_TXT);
                	} else if(Constantes.CODE_DEBITO.equals(data[2])) {
                		movimiento.setTipo(Constantes.CODE_DEBITO_TXT);
                	}
                	movimiento.setMonto(new BigDecimal(data[3]));
                	movimiento.setDescripcion(data[4]);
                	lstMovimientos.add(movimiento);
                }
            }
        } catch (IOException e) {
        	LOG.error("ERROR: " + e.getMessage());
            e.printStackTrace();
        }
        
        return lstMovimientos;
	}
	
	public static BigDecimal calcularSaldoActual(List<VOMovimiento> lstMovimientos) {
		BigDecimal saldoActual = BigDecimal.ZERO;
		for(VOMovimiento mov : lstMovimientos) {
			if(Constantes.CODE_CREDITO_TXT.equals(mov.getTipo())) {
				saldoActual = saldoActual.add(mov.getMonto());
			} else if (Constantes.CODE_DEBITO_TXT.equals(mov.getTipo())) {
				saldoActual = saldoActual.subtract(mov.getMonto());
			}
		}
		return saldoActual;
	}
}

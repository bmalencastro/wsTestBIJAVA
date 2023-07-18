package ec.com.bancointernacional.ws.rest.util;

public class Constantes {
	public static final Integer RESPONSE_CODE_OK = Integer.parseInt(AplicacionEJB.getString("app.response.code.ok"));
	public static final String RESPONSE_MESSAGE_OK = AplicacionEJB.getString("app.response.message.ok");
	public static final Integer RESPONSE_CODE_9000 = Integer.parseInt(AplicacionEJB.getString("app.response.code.9000"));
	public static final String RESPONSE_MESSAGE_9000 = AplicacionEJB.getString("app.response.message.9000");
	public static final Integer RESPONSE_CODE_9001 = Integer.parseInt(AplicacionEJB.getString("app.response.code.9001"));
	public static final String RESPONSE_MESSAGE_9001 = AplicacionEJB.getString("app.response.message.9001");

	public static final String DATA_PATH = AplicacionEJB.getString("app.data.path");
	public static final String DATA_USUARIO_CSV = AplicacionEJB.getString("app.data.usuario.csv");
	public static final String DATA_MOVIMIENTO_CSV = AplicacionEJB.getString("app.data.movimiento.csv");
	public static final String CODE_CLIENTE = AplicacionEJB.getString("app.code.cliente");
	public static final String CODE_EMPLEADO = AplicacionEJB.getString("app.code.empleado");
	public static final String CODE_CREDITO = AplicacionEJB.getString("app.code.credito");
	public static final String CODE_CREDITO_TXT = AplicacionEJB.getString("app.code.credito.txt");
	public static final String CODE_DEBITO = AplicacionEJB.getString("app.code.debito");
	public static final String CODE_DEBITO_TXT = AplicacionEJB.getString("app.code.debito.txt");
	public static final Integer SIZE_USER_ID = Integer.parseInt(AplicacionEJB.getString("app.size.user.id"));
}

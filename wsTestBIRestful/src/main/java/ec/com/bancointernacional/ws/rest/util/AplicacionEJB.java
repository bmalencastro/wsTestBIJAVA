package ec.com.bancointernacional.ws.rest.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class AplicacionEJB {
	private static final String BUNDLE_NAME = "ec.com.bancointernacional.resources.aplicacionEjb";
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

	private AplicacionEJB() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}

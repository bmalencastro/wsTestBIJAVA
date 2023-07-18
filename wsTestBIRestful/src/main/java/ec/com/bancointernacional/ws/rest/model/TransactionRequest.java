package ec.com.bancointernacional.ws.rest.model;

public class TransactionRequest {
	private Header header;
	private String userId;

	public TransactionRequest() {
		super();
	}

	public TransactionRequest(Header header, String userId) {
		super();
		this.header = header;
		this.userId = userId;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}

package ec.com.bancointernacional.ws.rest.model;

import org.codehaus.jackson.annotate.JsonProperty;

public class Header {
	private static final long serialVersionUID = -7109687601582578616L;

	public Header() {
		super();
	}

	public Header(String ipAddress, String channel, String customerId, String additionalCusId, String sequential,
			String dateAndTime, String userId, String productCode, String serviceCode, String tranServiceCode,
			String groupId, String bankId) {
		super();
		this.ipAddress = ipAddress;
		this.channel = channel;
		this.customerId = customerId;
		this.additionalCusId = additionalCusId;
		this.sequential = sequential;
		this.dateAndTime = dateAndTime;
		this.userId = userId;
		this.productCode = productCode;
		this.serviceCode = serviceCode;
		this.tranServiceCode = tranServiceCode;
		this.groupId = groupId;
		this.bankId = bankId;
	}

	@JsonProperty("ipAddress")
	private String ipAddress;

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("customerId")
	private String customerId;

	@JsonProperty("additionalCusId")
	private String additionalCusId;

	@JsonProperty("sequential")
	private String sequential;

	@JsonProperty("dateAndTime")
	private String dateAndTime;

	@JsonProperty("userId")
	private String userId;

	@JsonProperty("productCode")
	private String productCode;

	@JsonProperty("serviceCode")
	private String serviceCode;

	@JsonProperty("tranServiceCode")
	private String tranServiceCode;

	@JsonProperty("groupId")
	private String groupId;

	@JsonProperty("bankId")
	private String bankId;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getSequential() {
		return this.sequential;
	}

	public void setSequential(String sequential) {
		this.sequential = sequential;
	}

	public String getDateAndTime() {
		return this.dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getTranServiceCode() {
		return this.tranServiceCode;
	}

	public void setTranServiceCode(String tranServiceCode) {
		this.tranServiceCode = tranServiceCode;
	}

	public String getAdditionalCusId() {
		return this.additionalCusId;
	}

	public void setAdditionalCusId(String additionalCusId) {
		this.additionalCusId = additionalCusId;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getBankId() {
		return this.bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	@Override
	public String toString() {
		return "Header [ipAddress=" + ipAddress + ", channel=" + channel + ", customerId=" + customerId
				+ ", additionalCusId=" + additionalCusId + ", sequential=" + sequential + ", dateAndTime=" + dateAndTime
				+ ", userId=" + userId + ", productCode=" + productCode + ", serviceCode=" + serviceCode
				+ ", tranServiceCode=" + tranServiceCode + ", groupId=" + groupId + ", bankId=" + bankId + "]";
	}
}

package employee.portal.model.vo;

public class ResponseInfo {

	private String responseCode;
	private String responseDesc;
	
	
	public ResponseInfo(String responseCode, String responseDesc) {
		super();
		this.responseCode = responseCode;
		this.responseDesc = responseDesc;
	}
	
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseDesc
	 */
	public String getResponseDesc() {
		return responseDesc;
	}
	/**
	 * @param responseDesc the responseDesc to set
	 */
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseInfo [responseCode=" + responseCode + ", responseDesc=" + responseDesc + "]";
	}
	
	
}

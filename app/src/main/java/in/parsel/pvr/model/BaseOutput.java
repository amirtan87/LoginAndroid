package in.parsel.pvr.model;

import java.util.List;

/**
 * Created by patch on 22/03/15.
 */
public class BaseOutput {

    public static final String SUC_RESP_CODE = "1000";
    public static final String FAL_RESP_CODE = "1001";
    public static final String LOGIN_REQUIRED = "1002";

    private String responseCode;
    private String responseMessage;
    private List<Error> errors;
    private boolean isValid;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public void setResponseCode(String responseCode) { this.responseCode = responseCode; }
    public void setErrors(List<Error> errors) { this.errors = errors; }
    public void setIsValid(boolean isValid) {this.isValid = isValid;}


    public String getResponseCode() { return responseCode; }
    public List<Error> getErrors() { return errors; }
    public boolean isValid() {return isValid;}

}

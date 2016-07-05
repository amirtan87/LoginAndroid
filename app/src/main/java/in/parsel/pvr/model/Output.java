package in.parsel.pvr.model;

import java.util.ArrayList;
import java.util.List;

public class Output {

	private String value;
	private String status;

	public void setValue(String value) { this.value = value; }
	public void setStatus(String status) { this.status = status; }

	public String getValue() { return value; }
	public String getStatus() { return status; }

	public List<Error> getErrors() {

		List<Error> errors = new ArrayList<Error>();
		Error error;
		value = value.replace("[", "");
		value = value.replace("]", "");
		for (String err : value.split(",")) {
			error = new Error(err);
			errors.add(error);
		}
		return errors;
	}
}

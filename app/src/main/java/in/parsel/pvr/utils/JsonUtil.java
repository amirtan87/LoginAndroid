package in.parsel.pvr.utils;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {

	public static boolean isJSONValid(String json) {
		
	    try {
	        new JSONObject(json);
	        return true;
	    } catch(JSONException ex) { 
	        return false;
	    }
	}
}

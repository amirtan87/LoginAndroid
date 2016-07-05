package in.parsel.pvr.model.input;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patch on 31/05/16.
 */

public class RegisterRequest extends StringRequest {

    private static final String  REGISTER_REQUEST_URL = "https://dev.parsel.in/pbb/sec/signup" ;
    private Map<String ,String> params ;

    public RegisterRequest (String name, String username, String address , String password , Response.Listener<String>Listener) {

        super(Method.POST ,REGISTER_REQUEST_URL ,Listener ,null);
        params = new HashMap<>();
        params.put("name" ,name);
        params.put("username",username);
        params.put("password",password);
        params.put("address",address);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

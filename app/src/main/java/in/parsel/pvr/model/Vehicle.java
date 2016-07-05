package in.parsel.pvr.model;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by patch on 22/03/15.
 */
public class Vehicle {

    private long vehicleId;
    private String vehicleName;
    private String vehicleClass;
    private String vehicleNo;
    private int vehicleType;
    private String chassisNo;

    public void setVehicleId(long vehicleId) { this.vehicleId = vehicleId; }
    public void setVehicleName(String vehicleName) { this.vehicleName = vehicleName; }
    public void setVehicleClass(String vehicleClass) { this.vehicleClass = vehicleClass; }
    public void setVehicleNo(String vehicleNo) { this.vehicleNo = vehicleNo; }
    public void setVehicleType(int vehicleType) { this.vehicleType = vehicleType; }
    public void setChassisNo(String chassisNo) { this.chassisNo = chassisNo; }

    public long getVehicleId() { return vehicleId; }
    public String getVehicleName() { return vehicleName; }
    public String getVehicleClass() { return vehicleClass; }
    public String getVehicleNo() { return vehicleNo; }
    public int getVehicleType() { return vehicleType; }
    public String getChassisNo() { return chassisNo; }

    /**
     * Created by patch on 01/06/16.
     */

    public static class LoginRequest extends StringRequest {

        private static final String  LOGIN_REQUEST_URL = "https://dev.parsel.in/pbb/sec/login" ;
        private Map<String ,String> params ;

        public LoginRequest ( String username,  String password , Response.Listener<String>Listener) {

            super(Method.POST ,LOGIN_REQUEST_URL ,Listener ,null);
            params = new HashMap<>();
            params.put("username",username);
            params.put("password",password);

        }

        public Map<String, String> getParams() {
            return params;
        }
    }
}

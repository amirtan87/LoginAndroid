package in.parsel.pvr.model.output;

import in.parsel.pvr.model.BaseOutput;
import in.parsel.pvr.model.User;
import in.parsel.pvr.model.Vehicle;


/**
 * Created by Patch Software on 3/22/2015.
 */
public class LoginOutput extends BaseOutput {

    private User user;
    private Vehicle vehicle;
    private String droidVersion;

    public String getDroidVersion() {
        return droidVersion;
    }

    public void setDroidVersion(String droidVersion) {
        this.droidVersion = droidVersion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}



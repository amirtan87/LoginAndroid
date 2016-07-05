package in.parsel.pvr.model;

import in.parsel.pvr.utils.ModelUtil;

/**
 * Created by Patch Software on 3/22/2015.
 */
public class User {

    private long userId;
    private String firstName;
    private String lastName;
    private int userType;
    private String email;
    private String phone;
    private int online;
    private int login;
    private String locality;
    private int sockOnline;

    public User(){

    }

    public User(String data){
        User user = (User) ModelUtil.deserialize(data, User.class);
        this.setUserId(user.getUserId());
        this.setFirstName(user.getFirstName());
        this.setLastName(user.getLastName());
        this.setUserType(user.getUserType());
        this.setEmail(user.getEmail());
        this.setPhone(user.getPhone());
        this.setOnline(user.getOnline());
        this.setLogin(user.getLogin());
        this.setLocality(user.getLocality());
        this.setSockOnline(user.getSockOnline());
    }

    public int getSockOnline() {
        return sockOnline;
    }

    public void setSockOnline(int sockOnline) {
        this.sockOnline = sockOnline;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setUserId(long userId) { this.userId = userId; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setUserType(int userType) { this.userType = userType; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setOnline(int online) { this.online = online; }

    public long getUserId() { return userId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getUserType() { return userType; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public int getOnline() { return online; }

}

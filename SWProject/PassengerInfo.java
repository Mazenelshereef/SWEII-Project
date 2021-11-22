package SWProject;

public class PassengerInfo extends UserInfo {

    public PassengerInfo(PassengerInfo obj){
        this.username = obj.username;
        this.password = obj.password;
        this.email = obj.email;
        this.mobileNumber = obj.mobileNumber;
        this.isSuspended = obj.isSuspended;
    }

    public PassengerInfo(String username, String password, String email, String mobileNumber){
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.isSuspended = false;
    }

    @Override
    public String toString() {
        return "Passenger info: [username=" + username + ", email=" + email 
            + ", mobile number=" + mobileNumber + ", isSuspended=" + isSuspended + "]";
    }
}

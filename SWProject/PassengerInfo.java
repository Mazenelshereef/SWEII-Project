package SWProject;

public class PassengerInfo extends UserInfo {

    public PassengerInfo(PassengerInfo obj){
        this.username = obj.username;
        this.password = obj.password;
        this.email = obj.email;
        this.mobileNumber = obj.mobileNumber;
        this.isSuspended = obj.isSuspended;
    }

    @Override
    public String toString() {
        return "[Passenger info: username=" + username + "\temail=" + email 
            + "\tmobile number=" + mobileNumber + "\tisSuspended=" + isSuspended + "]";
    }
}

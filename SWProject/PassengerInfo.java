package SWProject;

public class PassengerInfo extends UserInfo implements IPassengerInfo {

    public PassengerInfo(DriverInfo obj){
        this.username = obj.username;
        this.password = obj.password;
        this.email = obj.email;
        this.mobileNumber = obj.mobileNumber;
        this.isSuspended = obj.isSuspended;
    }
}

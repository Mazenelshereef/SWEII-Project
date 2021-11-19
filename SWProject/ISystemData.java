package SWProject;

public interface ISystemData {
    public boolean registerPassenger(UserInfo info);
    public boolean registerDriver(UserInfo info);
    //login functions
    public void notifyDrivers(IRide ride);
    public void recieveRequestResponce(IRegistration registration, boolean isAccepted);
    
}

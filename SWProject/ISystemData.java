package SWProject;

import java.util.ArrayList;

public interface ISystemData {
    public boolean registerPassenger(UserInfo info);
    public boolean registerDriver(UserInfo info);
    //login functions
    public void notifyDrivers(IRide ride);
    public void recieveRequestResponce(IRegistration registration, boolean isAccepted);
    public ArrayList<IRegistration> getRequests();

}

package SWProject;

import java.util.ArrayList;

public interface ISystemData {
    /*public boolean registerPassenger(PassengerInfo info);
    public boolean registerDriver(DriverInfo info);
    public IAdmin loginIAdmin(String username, String password);
    public IDriver loginIDriver(String username, String password);
    public IPassenger loginIPassenger(String username, String password);*/
    public void recieveRequestResponce(IRegistration registration, boolean isAccepted);
    public ArrayList<IRegistration> getRegistrations();
    public ArrayList<IDriver> getDrivers();
    public ArrayList<IPassenger> getPassengers();
    public IAdmin getAdmin();

}

package SWProject;

import java.util.ArrayList;

public interface ISystemData {
    public ArrayList<IRegistrationRequest> getRegistrations();
    public ArrayList<IDriver> getDrivers();
    public ArrayList<IPassenger> getPassengers();
    public IAdmin getAdmin();
    
}

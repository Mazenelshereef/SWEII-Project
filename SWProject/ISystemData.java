package SWProject;

import java.util.ArrayList;

public interface ISystemData {
    public boolean displayAllRegistrations();
    public boolean addRegistrationRequest(IRegistrationRequest registrationRequest);
    public boolean addDriver(IDriver driver);
    public boolean addPassenger(IPassenger passenger);
    public IRegistrationRequest getRegistrationRequest(int index);
    public IDriver getDriver(String username);
    public IPassenger getPassenger(String username);
    public IAdmin getAdmin(String username);
    public ArrayList<IDriver> getDriversWithFavouriteArea(String area);
    public boolean removeRegisrationRequest(IRegistrationRequest registrationRequest);

}

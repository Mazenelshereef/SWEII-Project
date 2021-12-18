package SWProject;

import java.util.ArrayList;

public interface ISystemDataStrategy {
    public boolean displayAllRegistrations();
    public boolean addRegistrationRequest(IRegistrationRequest registrationRequest);
    public boolean addDriver(IDriver driver);
    public boolean addPassenger(IPassenger passenger);
    public boolean addOffer(IOffer offer);
    public boolean addRide(IRide ride);
    public boolean addRating(IRating rating);
    public IRegistrationRequest getRegistrationRequest(int index);
    public IDriver getDriver(String username);
    public IPassenger getPassenger(String username);
    public IAdmin getAdmin(String username);
    public ArrayList<IDriver> getDriversWithFavouriteArea(String area);
    public ArrayList<IOffer> getOffersOfPassenger(IPassenger passenger);
    public boolean removeRegisrationRequest(IRegistrationRequest registrationRequest);
}

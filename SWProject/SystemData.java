package SWProject;

import java.util.ArrayList;

public class SystemData implements ISystemData {

    private static SystemData instance;
    private ISystemDataStrategy dataContainer;

    private SystemData(){
        dataContainer = new ArrayListStrategy(); //default type
    }

    public static SystemData getInstance(){
        if (instance == null)
            instance = new SystemData();
        return instance;
    }
    
    @Override
    public void setStrategy(ISystemDataStrategy strategy) {
        dataContainer = strategy;
    }

    @Override
    public IAdmin getAdmin(String username) {
        return dataContainer.getAdmin(username);
    }

    @Override
    public boolean addRegistrationRequest(IRegistrationRequest registrationRequest) {
        return dataContainer.addRegistrationRequest(registrationRequest);
    }

    @Override
    public boolean addDriver(IDriver driver) {
        return dataContainer.addDriver(driver);
    }

    @Override
    public boolean addPassenger(IPassenger passenger) {
        return dataContainer.addPassenger(passenger);
    }

    @Override
    public boolean addOffer(IOffer offer) {
        return dataContainer.addOffer(offer);
    }

    @Override
    public boolean addRide(IRide ride) {
        return dataContainer.addRide(ride);
    }

    @Override
    public boolean addRating(IRating rating) {
        return dataContainer.addRating(rating);
    }

    @Override
    public IRegistrationRequest getRegistrationRequest(int index) {
        return dataContainer.getRegistrationRequest(index);
    }

    @Override
    public IDriver getDriver(String username) {
        return dataContainer.getDriver(username);
    }

    @Override
    public IPassenger getPassenger(String username) {
        return dataContainer.getPassenger(username);
    }

    @Override
    public boolean removeRegisrationRequest(IRegistrationRequest registrationRequest) {
        return dataContainer.removeRegisrationRequest(registrationRequest);
    }

    @Override
    public boolean displayAllRegistrations() {
        return dataContainer.displayAllRegistrations();
    }

    @Override
    public ArrayList<IDriver> getDriversWithFavouriteArea(String area) {
        return dataContainer.getDriversWithFavouriteArea(area);
    }

    @Override
    public ArrayList<IOffer> getOffersOfPassenger(IPassenger passenger) {
        return dataContainer.getOffersOfPassenger(passenger);
    }
}

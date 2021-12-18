package SWProject;

import java.util.ArrayList;

public class SystemData implements ISystemData {
    private ArrayList<IPassenger> passengers;
    private ArrayList<IDriver> drivers;
    private ArrayList<IRegistrationRequest> registrations;
    private IAdmin admin;
    private static SystemData instance;

    private SystemData(){
        passengers = new ArrayList<IPassenger>();
        drivers = new ArrayList<IDriver>();
        registrations = new ArrayList<IRegistrationRequest>();
        admin = new Admin("admin", "0000");
    }

    public static SystemData getInstance(){
        if (instance == null)
            instance = new SystemData();
        return instance;
    }   
    
    @Override
    public IAdmin getAdmin(String username) {
        if (admin.getUsername().equals(username))
            return admin;
        return null;
    }

    @Override
    public boolean addRegistrationRequest(IRegistrationRequest registrationRequest) {
        return registrations.add(registrationRequest);
    }

    @Override
    public boolean addDriver(IDriver driver) {
        return drivers.add(driver);
    }

    @Override
    public boolean addPassenger(IPassenger passenger) {
        return passengers.add(passenger);
    }

    @Override
    public IRegistrationRequest getRegistrationRequest(int index) {
        return registrations.get(index);
    }

    @Override
    public IDriver getDriver(String username) {
        for (IDriver driver : drivers){
            if (driver.getPersonalInfo().getUsername().equals(username)){
                return driver;
            }    
        }
        return null;
    }

    @Override
    public IPassenger getPassenger(String username) {
        for (IPassenger passenger : passengers){
            if (passenger.getPersonalInfo().getUsername().equals(username)){
                return passenger;
            }              
        }
        return null;
    }

    @Override
    public boolean removeRegisrationRequest(IRegistrationRequest registrationRequest) {
        return registrations.remove(registrationRequest);
    }

    @Override
    public boolean displayAllRegistrations() {
        for(int i=0; i < registrations.size(); i++){
            System.out.println((i+1) +":"+ registrations.get(i));
        }
        if (registrations.size() == 0)
        {
            return false;
        }
        return true; 
    }

    @Override
    public ArrayList<IDriver> getDriversWithFavouriteArea(String area) {
        ArrayList<IDriver> driversWithFavouriteArea = new ArrayList<>();
        for (IDriver driver : drivers){
            if (driver.hasFavouriteArea(area)){
                driversWithFavouriteArea.add(driver);
            }
        }
        return driversWithFavouriteArea;
    }
}

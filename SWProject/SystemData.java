package SWProject;

import java.util.ArrayList;

public class SystemData implements ISystemData {
    private ArrayList<IPassenger> passengers;
    private ArrayList<IDriver> drivers;
    private ArrayList<IRegistration> registrations;
    private IAdmin admin;
    private static SystemData instance;

    private SystemData(){
        passengers = new ArrayList<IPassenger>();
        drivers = new ArrayList<IDriver>();
        registrations = new ArrayList<IRegistration>();
        admin = new Admin("admin", "0000");
    }

    public static SystemData getInstance(){
        if (instance == null)
            instance = new SystemData();
        return instance;
    }

    @Override
    public boolean registerPassenger(PassengerInfo info){
        passengers.add(new Passenger(info));
        return true;
    }
    
    @Override
    public boolean registerDriver(DriverInfo info){
        registrations.add(new Registration(info));
        return true;
    }

    //login functions

    @Override
    public void notifyDrivers(IRide ride){
        for (IDriver driver : drivers){
            if (driver.hasFavouriteArea(ride.getSource())){
                driver.recieveRideNotification(ride);
            }
        }
    }

    @Override
    public void recieveRequestResponce(IRegistration registration, boolean isAccepted) {
        if (isAccepted)
            drivers.add(new Driver(registration.getUserInfo()));
        registrations.remove(registration);
    }

    @Override
    public ArrayList<IRegistration> getRegistrations() {
        return registrations;
    }

    @Override
    public ArrayList<IDriver> getDrivers() {
        return drivers;
    }

    @Override
    public ArrayList<IPassenger> getPassengers() {
        return passengers;
    }

    @Override
    public IAdmin loginIAdmin(String username, String password) {
        if (admin.getUsername().equals(username) && admin.getPassword().equals(password))
            return admin;
        return null;
    }

    @Override
    public IDriver loginIDriver(String username, String password) {
        for (IDriver driver : drivers){
            if (driver.getPersonalInfo().getUsername().equals(username) && driver.getPersonalInfo().getPassword().equals(password))
                return driver;
        }
        return null;
    }

    @Override
    public IPassenger loginIPassenger(String username, String password) {
        for (IPassenger passenger : passengers){
            if (passenger.getPersonalInfo().getUsername().equals(username) && passenger.getPersonalInfo().getPassword().equals(password))
                return passenger;
        }
        return null;
    }
    
}

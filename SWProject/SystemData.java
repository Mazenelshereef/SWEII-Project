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
    public boolean registerPassenger(UserInfo info){
        passengers.add(new Passenger(/*info*/));
        return true;
    }
    
    @Override
    public boolean registerDriver(UserInfo info){
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
            drivers.add(new Driver(/*registration.getUserInfo()*/));
        registrations.remove(registration);
    }

    @Override
    public ArrayList<IRegistration> getRequests() {
        return registrations;
    }
    
}

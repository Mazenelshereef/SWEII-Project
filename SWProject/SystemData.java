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
    public ArrayList<IRegistrationRequest> getRegistrations() {
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
    public IAdmin getAdmin() {
        return admin;
    }
}

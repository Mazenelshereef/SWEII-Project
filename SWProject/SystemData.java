package SWProject;

import java.util.ArrayList;

public class SystemData implements ISystemData {
    ArrayList<IRegistration> requests = new ArrayList <IRegistration>();
    ArrayList<IDriver> drivers = new ArrayList <IDriver>();

    @Override
    public ArrayList<IRegistration> getRequests() {
        return requests;
    }
    public void addDriver(IDriver driver){
        drivers.add(driver);
    }
    public void removeDriver(IDriver driver){
        drivers.remove(driver);
    }
}

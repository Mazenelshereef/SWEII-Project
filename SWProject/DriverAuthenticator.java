package SWProject;

public class DriverAuthenticator implements ILoginAuthenticator, IRegisterAuthenticator {

    private static DriverAuthenticator instance;

    private DriverAuthenticator(){}

    public static DriverAuthenticator getInstance(){
        if (instance == null)
            instance = new DriverAuthenticator();
        return instance;
    }

    @Override
    public boolean register(UserInfo userInfo) {
        SystemData.getInstance().getRegistrations().add(new RegistrationRequest(userInfo));
        return true;
    }

    @Override
    public IUser login(String username, String password) throws Exception {
        for (IDriver driver : SystemData.getInstance().getDrivers()){
            if (driver.getPersonalInfo().getUsername().equals(username) && driver.getPersonalInfo().getPassword().equals(password))
            {
                if (!driver.getPersonalInfo().getSuspended())
                    return driver;
                else
                    throw new Exception("ERROR: This driver is suspended");
            }    
            
        }
        throw new Exception("ERROR: This driver was not found, please check username and password");
    }

    public void recieveRequestResponce(IRegistrationRequest registration, boolean isAccepted) {
        if (isAccepted)
            SystemData.getInstance().getDrivers().add(new Driver((DriverInfo)registration.getUserInfo()));
        SystemData.getInstance().getRegistrations().remove(registration);
    }

    @Override
    public IUser search(String username) throws Exception {
        for (IDriver driver : SystemData.getInstance().getDrivers()){
            if (driver.getPersonalInfo().getUsername().equals(username)){
                return driver;
            }    
        }
        throw new Exception("ERROR: This driver was not found");
    }
    
}

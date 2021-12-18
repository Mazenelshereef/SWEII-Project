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
        return SystemData.getInstance().addRegistrationRequest(new RegistrationRequest(userInfo));
    }

    @Override
    public IUser login(String username, String password) throws Exception {
        IDriver driver = SystemData.getInstance().getDriver(username);
        if (driver != null){
            if (driver.getPersonalInfo().getPassword().equals(password)){
                if (!driver.getPersonalInfo().getSuspended())
                    return driver;
                else
                    throw new Exception("ERROR: This Driver is suspended");
            }
            else{
                throw new Exception("Error: Incorrect password, please check password and try again");
            } 
        }
        throw new Exception("ERROR: This Driver was not found");
    }

    public void recieveRequestResponce(IRegistrationRequest registration, boolean isAccepted) {
        if (isAccepted)
            SystemData.getInstance().addDriver(new Driver((DriverInfo)registration.getUserInfo()));
        SystemData.getInstance().removeRegisrationRequest(registration);
    }

    /*
    @Override
    public IUser search(String username) throws Exception {
        for (IDriver driver : SystemData.getInstance().getDrivers()){
            if (driver.getPersonalInfo().getUsername().equals(username)){
                return driver;
            }    
        }
        throw new Exception("ERROR: This driver was not found");
    }
    */
}

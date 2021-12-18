package SWProject;

public class PassengerAuthenticator implements ILoginAuthenticator, IRegisterAuthenticator {

    private static PassengerAuthenticator instance;

    private PassengerAuthenticator(){}

    public static PassengerAuthenticator getInstance(){
        if (instance == null)
            instance = new PassengerAuthenticator();
        return instance;
    }

    @Override
    public boolean register(UserInfo userInfo) {
        return SystemData.getInstance().addPassenger(new Passenger(userInfo));
    }

    @Override
    public IUser login(String username, String password) throws Exception {
        IPassenger passenger = SystemData.getInstance().getPassenger(username);
        if (passenger != null){
            if (passenger.getPersonalInfo().getPassword().equals(password)){
                if (!passenger.getPersonalInfo().getSuspended())
                    return passenger;
                else
                    throw new Exception("ERROR: This Passenger is suspended");
            }
            else{
                throw new Exception("Error: Incorrect password, please check password and try again");
            } 
        }
        throw new Exception("ERROR: This Passenger was not found");
    }
}

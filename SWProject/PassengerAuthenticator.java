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
        SystemData.getInstance().getPassengers().add(new Passenger(userInfo));
        return true;
    }

    @Override
    public IUser login(String username, String password) throws Exception {
        for (IPassenger passenger : SystemData.getInstance().getPassengers()){
            if (passenger.getPersonalInfo().getUsername().equals(username) && passenger.getPersonalInfo().getPassword().equals(password)){
                if (!passenger.getPersonalInfo().getSuspended())
                    return passenger;
                else
                    throw new Exception("ERROR: This Passenger is suspended");
            }
                
        }
        throw new Exception("ERROR: This Passenger was not found, please check username and password");
    }

    @Override
    public IUser search(String username) throws Exception {
        for (IPassenger passenger : SystemData.getInstance().getPassengers()){
            if (passenger.getPersonalInfo().getUsername().equals(username)){
                return passenger;
            }              
        }
        throw new Exception("ERROR: This Passenger was not found");
    }
    
}

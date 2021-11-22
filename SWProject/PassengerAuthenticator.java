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
    public IUser login(String username, String password) {
        for (IPassenger passenger : SystemData.getInstance().getPassengers()){
            if (passenger.getPersonalInfo().getUsername().equals(username) && passenger.getPersonalInfo().getPassword().equals(password))
                return passenger;
        }
        return null;
    }
    
}

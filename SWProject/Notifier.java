package SWProject;

public class Notifier implements INotifier {
    private static Notifier instance;
    
    private Notifier(){}

    public static Notifier getInstance(){
        if (instance == null)
            instance = new Notifier();
        return instance;
    }

    @Override
    public void notifyDriversWithRide(IRide ride) {
        for (IDriver driver : SystemData.getInstance().getDrivers()){
            if (driver.hasFavouriteArea(ride.getSource())){
                driver.recieveRideNotification(ride);
            }
        }
    }


}

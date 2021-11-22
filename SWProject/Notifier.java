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

    @Override
    public void notifyDriverWithRating(IRating rating, IDriver driver) {
        driver.recieveRating(rating);
    }

    @Override
    public void notifyPassengerWithOffer(IOffer offer, IRide ride) {
        ride.recieveOffer(offer);
        ride.getItsPassenger().recieveOffer(offer);
    }


}

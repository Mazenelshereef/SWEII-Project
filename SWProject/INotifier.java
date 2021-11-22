package SWProject;

public interface INotifier {
    public void notifyDriversWithRide(IRide ride);
    public void notifyDriverWithRating(IRating rating, IDriver driver);
    public void notifyPassengerWithOffer(IOffer offer, IRide ride);
}

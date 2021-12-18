package SWProject;

public interface INotifier {
    public void notifyDriversWithRide(IRide ride);
    public void notifyDriverWithRating(IRating rating);
    public void notifyPassengerWithOffer(IOffer offer);
}

package SWProject;

public interface IDriver {
    public UserInfo getPersonalInfo();
    public boolean hasFavouriteArea(String area);
    public void recieveRideNotification(IRide ride);
    public double getAverageRate();
    public void recieveRating(IRating rating);
}

package SWProject;

public interface IPassenger extends ISuspendableUser {
    public void setPersonalInfo(UserInfo personalInfo);
    public UserInfo getPersonalInfo();
    public double checkDriverRating(IDriver driver);
    public void acceptOffer(IOffer offer);
    public void denyOffer(IOffer offer);
    public boolean checkOffers();
    public void rateDriver(IDriver driver, int ratingValue) throws Exception;
    public void requestRide(String s, String d);
    public void recieveNotification(String notification);
    public String getNotification(int index);
    public void removeNotification(int index);
    public boolean viewNotifications();
}

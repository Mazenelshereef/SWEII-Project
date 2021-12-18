package SWProject;

public interface IPassenger extends ISuspendableUser {
public UserInfo getPersonalInfo();
public double checkDriverRating(IDriver driver);
//public void recieveOffer (IOffer offer);
public void acceptOffer(IOffer offer);
public void denyOffer(IOffer offer);
public boolean checkOffers();
public void rateDriver(IDriver driver,int ratingValue) throws Exception;
public void requestRide(String s,String d);
}

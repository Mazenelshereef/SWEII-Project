package SWProject;

public interface IPassenger {

public UserInfo getPersonalInfo();
public double checkDriverRating(IDriver driver);
public void recieveOffer (IOffer offer);
public void acceptOffer(IOffer offer);
public void denyOffer(IOffer offer);
public void checkOffers();
public void rateDriver(IDriver driver,int rating);
public void requestRide(String s,String d);
}

package SWProject;

public interface IPassenger {
double checkDriverRating(IDriver driver);
void recieveOffer (IOffer offer);
void acceptOffer(IOffer offer);
void denyOffer(IOffer offer);
void checkOffers();
void rateDriver(IDriver driver,int rating);
void requestRide(String s,String d);
}

package SWProject;

public interface IPassenger {
double checkDriverRating(IDriver driver);
void recieveOffer (IOffer offer);
void acceptOffer(IOffer offer);
void denyOffer(IOffer offer);
void rateDriver(IDriver driver);
void checkOffers();
void rateDriver(IDriver driver,int rating);
}

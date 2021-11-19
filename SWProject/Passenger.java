package SWProject;

import java.util.ArrayList;

public class Passenger implements IPassenger {
    private UserInfo personalInfo;
    private  ArrayList<IOffer> recievedOffers;

    public UserInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Passenger(UserInfo personalInfo ) {
        this.personalInfo = personalInfo;
    }

    public double checkDriverRating(IDriver driver)
    {
        return driver.getAverageRate();

    }

    public  void recieveOffer(IOffer offer)
    {

    }

    public  void acceptOffer(IOffer offer)
    {
        offer.setisAccepted(true);
    }

    public  void denyOffer(IOffer offer)
    {
        offer.setisAccepted(false);
    }

    public  void rateDriver(IDriver driver)
    {

    }

    public  void checkOffers()

    {

    }
    public  void rateDriver(IDriver driver,int rating)
    {

    }
}

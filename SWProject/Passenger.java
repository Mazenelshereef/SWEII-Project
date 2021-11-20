package SWProject;

import java.util.ArrayList;

public class Passenger implements IPassenger {
    private UserInfo personalInfo;
    private  ArrayList<IOffer> recievedOffers;

    public Passenger(UserInfo personalInfo, ArrayList<IOffer> recievedOffers) {
        this.personalInfo = personalInfo;
        this.recievedOffers = recievedOffers;
    }

    public void setPersonalInfo(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public ArrayList<IOffer> getRecievedOffers() {
        return recievedOffers;
    }

    public void setRecievedOffers(ArrayList<IOffer> recievedOffers) {
        this.recievedOffers = recievedOffers;
    }

    public UserInfo getPersonalInfo() {
        return personalInfo;
    }
    public void requestRide(String s,String d)
      {
        IRide ride=new Ride(s,d);
      }

    public double checkDriverRating(IDriver driver)
    {
        return driver.getAverageRate();

    }

    public  void recieveOffer(IOffer offer)
    {
        recievedOffers.add(offer);
    }

    public  void acceptOffer(IOffer offer)
    {
        offer.setisAccepted(true);
    }

    public  void denyOffer(IOffer offer)
    {
        offer.setisAccepted(false);
    }

    public void checkOffers()
    {
        for (int i=0;i<recievedOffers.size();i++)
        {
            System.out.println("offer number "+i+1+" -- "+recievedOffers.get(i));
        }
    }
    public  void rateDriver(IDriver driver,int rating)
    {
        if (rating>=0&&rating<=5)
        {
            IRating rate=new Rating(rating);
            driver.recieveRating(rate);
        }
        else
        System.out.println("please enter number between 1 and 5");
    }
    
}

package SWProject;

import java.util.ArrayList;

public class Passenger implements IPassenger, IUser {
    private UserInfo personalInfo;
    private ArrayList<IOffer> recievedOffers;
    private ArrayList<IRide> myRides;

    public Passenger(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public void setPersonalInfo(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public UserInfo getPersonalInfo() {
        return personalInfo;
    }

    public ArrayList<IOffer> getRecievedOffers() {
        return recievedOffers;
    }

    public ArrayList<IRide> getMyRides() {
        return myRides;
    }

    public void requestRide(String source, String distenation) {
        IRide ride = new Ride(source, distenation, this);
        myRides.add(ride);
        //notify drivers that a ride is requested with source from their favourite areas
        SystemData.getInstance().notifyDrivers(ride);
    }

    public double checkDriverRating(IDriver driver) {
        return driver.getAverageRating();
    }

    public void recieveOffer(IOffer offer) {
        recievedOffers.add(offer);
    }

    public void acceptOffer(IOffer offer) {
        offer.setAccepted(true);
        recievedOffers.remove(offer);
    }

    public void denyOffer(IOffer offer) {
        offer.setAccepted(false);
        recievedOffers.remove(offer);
    }

    public void checkOffers() {
        for (int i = 0; i < recievedOffers.size(); i++) {
            System.out.println("offer number " + (i + 1) + " -- " + recievedOffers.get(i));
        }
    }

    public void rateDriver(IDriver driver, int rating) {
        if (rating >= 1 && rating <= 5) {
            driver.recieveRating(new Rating(rating));
        } else
            System.out.println("please enter number between 1 and 5");
    }

    @Override
    public void setSuspended(boolean isSuspended) {
        personalInfo.setSuspended(isSuspended);
    }

}

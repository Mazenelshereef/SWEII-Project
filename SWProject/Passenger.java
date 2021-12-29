package SWProject;

import java.util.ArrayList;

public class Passenger implements IPassenger {
    private UserInfo personalInfo;
    private ArrayList<String> notifications;
    private double balance;

    public Passenger(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
        notifications = new ArrayList<>();
        balance = 0;
    }

    @Override
    public void setPersonalInfo(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    @Override
    public UserInfo getPersonalInfo() {
        return personalInfo;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void addBalance(double amount) {
        balance += amount;        
    }

    @Override
    public boolean takeBalance(double amount) {
        if (amount <= balance)
        {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public void requestRide(String source, String destination, int noOfPassengers) {
        RideOfferFacade.getInstance().requestRide(new Ride(source, destination, noOfPassengers, this));
    }

    @Override
    public double checkDriverRating(IDriver driver) {
        return driver.getAverageRating();
    }

    @Override
    public void acceptOffer(IOffer offer) throws Exception {
        if(!RideOfferFacade.getInstance().acceptOffer(offer))
            throw new Exception("ERROR: You don't have enough balance!");
    }

    @Override
    public void denyOffer(IOffer offer) {
        RideOfferFacade.getInstance().denyOffer(offer);
    }

    @Override
    public boolean checkOffers() {
        if (SystemData.getInstance().getOffersOfPassenger(this).size() == 0){
            System.out.println("You have no recieved offers");
            return false;
        }   
        for (int i = 0; i < SystemData.getInstance().getOffersOfPassenger(this).size(); i++) {
            System.out.println("offer number " + (i + 1) + ": " + SystemData.getInstance().getOffersOfPassenger(this).get(i));
        }
        return true;
    }

    @Override
    public void rateDriver(IDriver driver, int ratingValue) throws Exception {
        if (ratingValue >= 1 && ratingValue <= 5) {
            SystemData.getInstance().addRating(new Rating(ratingValue, this, driver));
        } else
            throw new Exception("please enter number between 1 and 5");
    }

    @Override
    public void setSuspended(boolean isSuspended) {
        personalInfo.setSuspended(isSuspended);
    }

    @Override
    public void recieveNotification(String notification) {
        notifications.add(notification);
    }

    @Override
    public String getNotification(int index) {
        return notifications.get(index);
    }

    @Override
    public void removeNotification(int index) {
        notifications.remove(index);
    }

    @Override
    public boolean viewNotifications() {
        if (notifications.size() == 0){
            System.out.println("You have no notifications");
            return false;
        }     
        for(int i = 0 ; i < notifications.size() ; i++){
            System.out.println((i+1) + ": " + notifications.get(i));
        }
        return true;
    }
}

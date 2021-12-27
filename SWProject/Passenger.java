package SWProject;

import java.util.ArrayList;
import java.util.Calendar;

public class Passenger implements IPassenger {
    private UserInfo personalInfo;
    private ArrayList<String> notifications;

    public Passenger(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
        notifications = new ArrayList<>();
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
    public void requestRide(String source, String destination, int noOfPassengers) {
        IRide ride = new Ride(source, destination, noOfPassengers, this);

        //TODO: Discounts logic shouldn't be handled in Passenger
        if (SystemData.getInstance().containsRideOfPassenger(this))
            ride = new FirstRideDiscount(ride);
        if (SystemData.getInstance().containsDiscountArea(source))
            ride = new AreaDiscount(ride);
        if (noOfPassengers == 2)
            ride = new TwoPassengersDiscount(ride);
        if (/*TODO: publicHoliday*/true)
            ride = new HolidayDiscount(ride);
        if (Calendar.getInstance().get(Calendar.MONTH) == personalInfo.getMonthOfBirth() 
            && Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == personalInfo.getDayOfBirth())
            ride = new BirthdayDiscount(ride);
            
        SystemData.getInstance().addRide(ride);
    }

    @Override
    public double checkDriverRating(IDriver driver) {
        return driver.getAverageRating();
    }

    @Override
    public void acceptOffer(IOffer offer) {
        offer.setAccepted(true);
        //recievedOffers.remove(offer);
    }

    @Override
    public void denyOffer(IOffer offer) {
        offer.setAccepted(false);
        //recievedOffers.remove(offer);
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

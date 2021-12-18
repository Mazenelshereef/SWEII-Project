package SWProject;

public class Passenger implements IPassenger {
    private UserInfo personalInfo;
    //private ArrayList<IOffer> recievedOffers;
    //private ArrayList<IRide> myRides;

    public Passenger(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
        //recievedOffers = new ArrayList<>();
        //myRides = new ArrayList<>();
    }

    public void setPersonalInfo(UserInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public UserInfo getPersonalInfo() {
        return personalInfo;
    }

    /*public ArrayList<IOffer> getRecievedOffers() {
        return recievedOffers;
    }

    public ArrayList<IRide> getMyRides() {
        return myRides;
    }*/

    public void requestRide(String source, String destination) {
        IRide ride = new Ride(source, destination, this);
        /*myRides.add(ride);*/

        //notify drivers that a ride is requested with source from their favourite areas
        Notifier.getInstance().notifyDriversWithRide(ride);
    }

    public double checkDriverRating(IDriver driver) {
        return driver.getAverageRating();
    }
    /*
    public void recieveOffer(IOffer offer) {
        recievedOffers.add(offer);
    }
    */
    public void acceptOffer(IOffer offer) {
        offer.setAccepted(true);
        //recievedOffers.remove(offer);
    }

    public void denyOffer(IOffer offer) {
        offer.setAccepted(false);
        //recievedOffers.remove(offer);
    }

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

    public void rateDriver(IDriver driver, int ratingValue) throws Exception {
        if (ratingValue >= 1 && ratingValue <= 5) {
            Notifier.getInstance().notifyDriverWithRating(new Rating(ratingValue, this, driver));
        } else
            throw new Exception("please enter number between 1 and 5");
    }

    @Override
    public void setSuspended(boolean isSuspended) {
        personalInfo.setSuspended(isSuspended);
    }

}

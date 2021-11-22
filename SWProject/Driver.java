package SWProject;

import java.util.ArrayList;


public class Driver implements IDriver {

    private UserInfo personalInfo ;
    private ArrayList<String>favoriteAreas = new ArrayList<String>() ;
    private double averageRating = 0;
    private ArrayList<IRating> myRatings = new ArrayList<> () ;
    private ArrayList<IOffer>myOffers = new ArrayList<>() ;
    private ArrayList<IRide>favoriteAreaRides = new ArrayList<>() ;

    public Driver(DriverInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    @Override
    public void setSuspended(boolean isSuspended) {
        personalInfo.setSuspended(isSuspended);
    }

    public ArrayList<IOffer> getMyOffers() {
        return myOffers;
    }

    public void setMyOffers(ArrayList<IOffer> myOffers) {
        this.myOffers = myOffers;
    }

    public ArrayList<IRating> getMyRatings() {
        return myRatings;
    }

    public void setMyRatings(ArrayList<IRating> myRatings) {
        this.myRatings = myRatings;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    @Override
    public UserInfo getPersonalInfo() {
        return personalInfo;
    }

    @Override
    public void setPersonalInfo(UserInfo info) {
        this.personalInfo = (DriverInfo) info ;
    }

    @Override
    public boolean hasFavouriteArea(String area) {
        for(int i = 0 ; i < favoriteAreas.size() ; ++i){
            if( area.equals(favoriteAreas.get(i))){
                return true ;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return "Driver [personalInfo=" + personalInfo + ", averageRating=" + averageRating
                + ", favoriteAreas=" + favoriteAreas + "]";
    }

    @Override
    public void recieveRideNotification(IRide ride) {
        this.favoriteAreaRides.add(ride) ;        
    }

    @Override
    public void addFavoriteArea(String name) {
        favoriteAreas.add(name) ;        
    }

    @Override
    public void listRidesInFavouriteAreas() {     
        for(int i = 0 ; i < favoriteAreaRides.size() ; ++i){
            System.out.println((i+1) + ": " + favoriteAreaRides.get(i).toString());
        }
    }

    @Override
    public void suggestPrice(IRide ride, double price) {
        Notifier.getInstance().notifyPassengerWithOffer(new Offer(price, this), ride);   
    }

    @Override
    public void listRating() {
        for(int i = 0 ; i < myRatings.size() ; ++i){
            System.out.println((i+1) + ": " + myRatings.get(i).toString());
        }
        
    }

    @Override
    public void recieveRating(IRating rating) {
        this.myRatings.add(rating) ;
        this.averageRating = 0;
        for(int i = 0 ; i < myRatings.size() ; ++i){
            this.averageRating += myRatings.get(i).getValue() ;
        }       
        this.averageRating /= myRatings.size() ;
    }

    @Override
    public void viewMyOffers() {
        for(int i = 0 ; i < myOffers.size() ; ++i){
            System.out.println((i+1) + ": " + myOffers.get(i).toString());
        }
    }

}

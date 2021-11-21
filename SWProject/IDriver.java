package SWProject;

import java.util.ArrayList;

public interface IDriver {
    public UserInfo getPersonalInfo();
    public boolean hasFavouriteArea(String area);
    public void recieveRideNotification(Ride ride);
    public void setPersonalInfo(UserInfo info);
    public void addFavoriteArea(String name) ;
    public void listRidesInFavouriteAreas();
    public void suggestPrice(Ride ride , double price) ;
    public void listRating(); 
    public void recieveRating(Rating rating) ;
    public void viewMyOffers() ;
    public double getAverageRating() ;
    public void setAverageRating(double averageRating) ;
    public ArrayList<Rating> getMyRatings() ;
    public void setMyRatings(ArrayList<Rating> myRatings) ;
    public ArrayList<Offer> getMyOffers() ;
    public void setMyOffers(ArrayList<Offer> myOffers) ;
}

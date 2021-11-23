package SWProject;

import java.util.ArrayList;

public interface IDriver extends ISuspendableUser {
    public UserInfo getPersonalInfo();
    public boolean hasFavouriteArea(String area);
    public void recieveRideNotification(IRide ride);
    public void setPersonalInfo(UserInfo info);
    public void addFavoriteArea(String name) ;
    public boolean listRidesInFavouriteAreas();
    public void suggestPrice(IRide ride , double price) ;
    public void listPassengersRatings(); 
    public void recieveRating(IRating rating) ;
    public void viewMyOffers() ;
    public double getAverageRating() ;
    public void setAverageRating(double averageRating) ;
    public ArrayList<IRating> getMyRatings() ;
    public void setMyRatings(ArrayList<IRating> myRatings) ;
    public ArrayList<IOffer> getMyOffers() ;
    public void setMyOffers(ArrayList<IOffer> myOffers) ;
    public ArrayList<IRide> getFavouriteAreaRides();
}

package SWProject;

public interface IRide {
    public void setSource(String source);
    public String getSource();
    public void setDestination(String destination);
    public String getDestination();
    public void setNoOfPassengers(int noOfPassengers);
    public int getNoOfPassengers();
    //public void setOffers(ArrayList<IOffer> offers);
    //public ArrayList<IOffer> getOffers();
    public void setItsPassenger(IPassenger itsPassenger);
    public IPassenger getItsPassenger();
    //public void recieveOffer(IOffer offer);
}

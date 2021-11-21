package SWProject;

public interface IOffer {
    public Driver getItsDriver() ;
    public void setItsDriver(Driver itsDriver) ;
    //public Ride getItsRide();
    //public void setItsRide(Ride itsRide);
    public double getPrice() ;
    public void setPrice(double price) ;
    public boolean isAccepted() ;
    public void setAccepted(boolean isAccepted);
}

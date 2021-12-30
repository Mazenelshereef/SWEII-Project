package SWProject;

public class Offer implements IOffer {
    private IRide itsRide;
    private IDriver itsDriver;
    private double price;
    private boolean isAccepted;

    public Offer(double price, IDriver itsDriver, IRide itsRide){
        this.price = price;
        this.itsDriver = itsDriver;
        this.itsRide = itsRide;
        this.itsRide.addEvent("Captain added a price", itsDriver.getPersonalInfo().getUsername());
    }

    @Override
    public IDriver getItsDriver() {
        return itsDriver;
    }

    @Override
    public void setItsDriver(IDriver itsDriver) {
        this.itsDriver = itsDriver;
    }

    @Override
    public IRide getItsRide() {
        return itsRide;
    }

    @Override
    public void setItsRide(IRide ride) {
        itsRide = ride;      
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean isAccepted() {
        return isAccepted;
    }

    @Override
    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
        this.itsRide.addEvent("user accepted the ride", itsRide.getItsPassenger().getPersonalInfo().getUsername());
    }

    @Override
    public String toString() {
        return "Offer [isAccepted=" + isAccepted + ", itsDriver=" + itsDriver.getPersonalInfo().getUsername() + ", price="
                + price + "]";
    }
    
}

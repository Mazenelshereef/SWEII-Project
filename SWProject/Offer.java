package SWProject;

public class Offer implements IOffer {
    private IDriver itsDriver ;
    private double price  ;
    private boolean isAccepted ;

    public Offer(double price, IDriver itsDriver){
        this.price = price;
        this.itsDriver = itsDriver;
    }

    public IDriver getItsDriver() {
        return itsDriver;
    }
    public void setItsDriver(IDriver itsDriver) {
        this.itsDriver = itsDriver;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAccepted() {
        return isAccepted;
    }
    public void setAccepted(boolean isAccepted) {
        this.isAccepted = isAccepted;
    }
    @Override
    public String toString() {
        return "Offer [isAccepted=" + isAccepted + ", itsDriver=" + itsDriver.getPersonalInfo().getUsername() + ", price="
                + price + "]";
    }
    

    
}

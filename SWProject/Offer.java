package SWProject;

public class Offer implements IOffer {
    private Driver itsDriver ;
    private double price  ;
    private boolean isAccepted ;


    public Driver getItsDriver() {
        return itsDriver;
    }
    public void setItsDriver(Driver itsDriver) {
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
        return "Offer [isAccepted=" + isAccepted + ", itsDriver=" + itsDriver + ", price="
                + price + "]";
    }
    

    
}

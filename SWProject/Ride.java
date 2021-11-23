package SWProject;
import java.util.ArrayList;

public class Ride implements IRide {
    private String source;
    private String destination;
    private IPassenger itsPassenger;
    private ArrayList<IOffer> offers;

    public Ride(String source, String destination, IPassenger itsPassenger) {
        this.source = source;
        this.destination = destination;
        this.itsPassenger = itsPassenger;
        offers = new ArrayList<>();
    }

    @Override
    public String getSource(){
        return source;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public void setDestination(String destination) {
        this.destination = destination;
        
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public IPassenger getItsPassenger() {
        return itsPassenger;
    }

    @Override
    public void setItsPassenger(IPassenger itsPassenger) {
        this.itsPassenger = itsPassenger;
    }

    @Override
    public void setOffers(ArrayList<IOffer> offers) {
        this.offers = offers;
    }

    @Override
    public ArrayList<IOffer> getOffers() {
        return offers;
    }

    @Override
    public String toString() {
        return "Ride: {" +
                "source='" + source + '\'' +
                ", distenation='" + destination + '\'' +
                ", itsPassenger=" + itsPassenger.getPersonalInfo().getUsername() +
                ", offers=" + offers +
                '}';
    }

    @Override
    public void recieveOffer(IOffer offer) {
        offers.add(offer);
    }
}

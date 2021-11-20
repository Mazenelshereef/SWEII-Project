package SWProject;
import java.util.ArrayList;

public class Ride implements IRide {
    private String source;
    private String distenation;
    private IPassenger itsPassenger;
    private ArrayList<IOffer> offers;

    public Ride(String source, String distenation, IPassenger itsPassenger) {
        this.source = source;
        this.distenation = distenation;
        this.itsPassenger = itsPassenger;
    }

    public String getSource(){
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDistenation() {
        return distenation;
    }

    public void setDistenation(String distenation) {
        this.distenation = distenation;
    }

    public IPassenger getItsPassenger() {
        return itsPassenger;
    }

    public void setItsPassenger(IPassenger itsPassenger) {
        this.itsPassenger = itsPassenger;
    }

    public ArrayList<IOffer> getOffers() {
        return offers;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "sourse='" + source + '\'' +
                ", distenation='" + distenation + '\'' +
                ", itsPassenger=" + itsPassenger +
                ", offers=" + offers +
                '}';
    }
}

package SWProject;
import java.util.ArrayList;
public class Ride implements IRide {
    private String sourse;
    private String distenation;
    private IPassenger itsPassenger;
    private ArrayList<IOffer> offers;
    public Ride(String sourse, String distenation, IPassenger itsPassenger, ArrayList<IOffer> offers) {
        this.sourse = sourse;
        this.distenation = distenation;
        this.itsPassenger = itsPassenger;
        this.offers = offers;
    }
    public Ride(String sourse, String distenation) {
        this.sourse = sourse;
        this.distenation = distenation;
    }
    public String getSourse() {
        return sourse;
    }

    public void setSourse(String sourse) {
        this.sourse = sourse;
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

    public void setOffers(ArrayList<IOffer> offers) {
        this.offers = offers;
    }
    @Override
    public String toString() {
        return "Ride{" +
                "sourse='" + sourse + '\'' +
                ", distenation='" + distenation + '\'' +
                ", itsPassenger=" + itsPassenger +
                ", offers=" + offers +
                '}';
    }
}

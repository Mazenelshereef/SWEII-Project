package SWProject;

public class Rating implements IRating {
    private IPassenger itsPassenger ;
    private int value ;


    public int getValue() {
        return value;
    }
    public IPassenger getItsPassenger() {
        return itsPassenger;
    }
    public void setItsPassenger(IPassenger itsPassenger) {
        this.itsPassenger = itsPassenger;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Rating [itsPassenger=" + itsPassenger.getPersonalInfo().getUsername() + ", value=" + value + "]";
    }

    public Rating(int rate, IPassenger itsPassenger) {
        value = rate;
        this.itsPassenger = itsPassenger;
    }
}

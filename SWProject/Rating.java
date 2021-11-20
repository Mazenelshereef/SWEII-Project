package SWProject;

public class Rating {
    private Passenger itsPassenger ;
    private int value ;


    public int getValue() {
        return value;
    }
    public Passenger getItsPassenger() {
        return itsPassenger;
    }
    public void setItsPassenger(Passenger itsPassenger) {
        this.itsPassenger = itsPassenger;
    }
    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Rating [itsPassenger=" + itsPassenger + ", value=" + value + "]";
    }

}

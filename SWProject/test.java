package SWProject;


import java.util.Calendar;
public class test {
    public static void main(String[] args) {
        /*IRide ride = new Ride("f","f",2,new Passenger(new PassengerInfo()));
        ride = new FirstRideDiscount(ride);
        ride = new BirthdayDiscount(ride);
        ride = new HolidayDiscount(ride);
        ride.setPrice(50);
        System.out.println(ride.getCost(ride.getPrice()));
        System.out.println(ride.getDestination());*/
        System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK_IN_MONTH));
    }
}

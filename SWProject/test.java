package SWProject;

public class test {
    public static void main(String[] args) {
        IRide ride = new Ride("f","f",2,new Passenger(new PassengerInfo()));
        ride.setPrice(50);
        ride = new FirstRideDiscount(ride);
        ride = new BirthdayDiscount(ride);
        ride = new HolidayDiscount(ride);
        System.out.println(ride.getCost(ride.getPrice()));
        System.out.println(ride.getDestination());
    }
}

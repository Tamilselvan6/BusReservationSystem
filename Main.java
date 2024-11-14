package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus(1,true,45));
        buses.add(new Bus(2,false,2));
        buses.add(new Bus(3,true,50));

        ArrayList<Booking> bookings = new ArrayList<>();

        int userOption = 1;
        for(Bus b: buses){
            b.displayBusInfo();
        }
        while(userOption==1){
            System.out.println("Enter 1 to Book and 2 to Exit");
            userOption = sc.nextInt();
            if(userOption == 1){
                Booking booking = new Booking();
                if(booking.isAvailable(buses, bookings)){
                    bookings.add(booking);
                    System.out.println("Your Booking has been Confirmed");
                }
                else
                    System.out.println("Sorry. Bus is Full, please try again with some other Date or Bus");
            }
        }
    }
}
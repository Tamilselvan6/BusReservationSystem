package org.example;
import java.awt.print.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of Passenger: ");
        passengerName = sc.next();
        System.out.println("Enter Bus Number");
        busNo = sc.nextInt();
        System.out.println("Enter Date (dd-MM-yyyy)");
        String dateString = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings){
        int capacity = 0;
        for(Bus bus : buses){
            if(bus.getBusNo() == busNo)
                capacity = bus.getCapacity();
        }

        int booked = 0;
        for(Booking booking : bookings){
            if(booking.busNo == busNo && booking.date.equals(date)){
                booked++;
            }
        }

        if(booked<capacity){
            return true;
        }
        return false;
    }
}

package org.example;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    Bus(int no, boolean ac, int capacity){
        busNo = no;
        this.ac = ac;
        this.capacity = capacity;
    }

    public void displayBusInfo(){
        System.out.println("Bus Number:" + busNo + ", AC:"+ ac +", Capacity:" + capacity);
    }

    //getter and setter
    public int getBusNo(){
        return busNo;
    }
    public boolean getAc(){
        return ac;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setBusNo(int no){
        busNo = no;
    }
    public void setCapacity(int cap){
        capacity = cap;
    }
    public void setAc(boolean ac){
        this.ac = ac;
    }
}

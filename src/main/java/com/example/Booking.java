package com.example;

public class Booking {

    private int bookingId;
    private String customerName;
    private String serviceName;
    private double amount;

    public Booking(int bookingId, String customerName, String serviceName, double amount) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.amount = amount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
                ", Customer: " + customerName +
                ", Service: " + serviceName +
                ", Amount: ₹" + amount;
    }
}

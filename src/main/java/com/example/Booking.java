package com.example;

public class Booking {

    private int bookingId;
    private String customerName;
    private String serviceName;
    private double amount;

    public Booking() {
    }

    public Booking(int bookingId, String customerName, String serviceName, double amount) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.serviceName = serviceName;
        this.amount = amount;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
                ", Customer: " + customerName +
                ", Service: " + serviceName +
                ", Amount: ₹" + amount;
    }
}

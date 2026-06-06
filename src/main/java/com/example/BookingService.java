package com.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookingService {

    private final List<Booking> bookings = new ArrayList<>();

    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> findByCustomerName(String customerName) {
        return bookings.stream()
                .filter(b -> b.getCustomerName() != null && b.getCustomerName().equalsIgnoreCase(customerName))
                .collect(Collectors.toList());
    }

    public double getTotalRevenue() {
        return bookings.stream().mapToDouble(Booking::getAmount).sum();
    }
}

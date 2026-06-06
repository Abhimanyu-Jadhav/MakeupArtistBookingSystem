package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("booking", new Booking());
        model.addAttribute("bookings", bookingService.getAllBookings());
        model.addAttribute("totalRevenue", bookingService.getTotalRevenue());
        model.addAttribute("searchResults", List.of());
        return "index";
    }

    @PostMapping("/bookings")
    public String addBooking(@ModelAttribute Booking booking) {
        bookingService.addBooking(booking);
        return "redirect:/";
    }

    @GetMapping("/search")
    public String searchCustomer(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("booking", new Booking());
        model.addAttribute("bookings", bookingService.getAllBookings());
        model.addAttribute("totalRevenue", bookingService.getTotalRevenue());
        model.addAttribute("searchResults", bookingService.findByCustomerName(name));
        model.addAttribute("searchName", name);
        return "index";
    }
}

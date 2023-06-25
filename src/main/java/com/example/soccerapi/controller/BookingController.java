package com.example.soccerapi.controller;

import com.example.soccerapi.emtity.Booking;
import com.example.soccerapi.emtity.KhachHang;
import com.example.soccerapi.service.BookingService;
import com.example.soccerapi.service.KhachHangService;
import org.apache.el.parser.BooleanNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/bookings")
public class BookingController {

    @Autowired
    private BookingService service;
    @Autowired
    private KhachHangService khachHangService;

    @GetMapping("")
    List<Booking> getAllBookings() {

        return service.getAllBooking();
    }




    @GetMapping("/{id}")
    List<Booking> getAllBookings(@PathVariable int id) {
        return service.getAllBookingId(id);
    }
}

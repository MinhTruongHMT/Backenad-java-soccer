package com.example.soccerapi.service;

import com.example.soccerapi.emtity.Booking;
import com.example.soccerapi.emtity.KhachHang;
import jakarta.transaction.Transactional;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBooking();
    List<Booking> getAllBookingId(int id);
    @Transactional
    Booking saveBooking(Booking booking);
}

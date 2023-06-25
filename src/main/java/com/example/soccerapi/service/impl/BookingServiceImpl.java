package com.example.soccerapi.service.impl;

import com.example.soccerapi.emtity.Booking;
import com.example.soccerapi.emtity.KhachHang;
import com.example.soccerapi.repository.BookingRepository;
import com.example.soccerapi.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository repository;
    @Override
    public List<Booking> getAllBooking() {
        return repository.findAll();
    }

    @Override
    public List<Booking> getAllBookingId(int id) {
        return repository.findByKhachHangId(id);
    }

    @Override
    public Booking saveBooking(Booking booking) {
        return repository.save(booking);
    }


}

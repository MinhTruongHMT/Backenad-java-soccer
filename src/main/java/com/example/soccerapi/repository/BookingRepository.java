package com.example.soccerapi.repository;

import com.example.soccerapi.emtity.Booking;
import com.example.soccerapi.emtity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findByKhachHangId(int khachHangId);
}

package com.example.soccerapi;

import com.example.soccerapi.emtity.Booking;
import com.example.soccerapi.emtity.KhachHang;
import com.example.soccerapi.emtity.SanBong;
import com.example.soccerapi.emtity.SanPham;
import com.example.soccerapi.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoccerApiApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(SoccerApiApplication.class, args);
    }

}

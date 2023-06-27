package com.example.soccerapi.controller;


import com.example.soccerapi.emtity.SanBong;
import com.example.soccerapi.service.SanBongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/sanbongs")
public class SanBongController {

    @Autowired
    private SanBongService sanBongService;
    @GetMapping("")
    List<SanBong> getAllKhachHang() {
        return sanBongService.getAllSanBong();
    }
//    @PostMapping("")
//    public  void  createBooking(){
//        SanBong sb = new SanBong();
//        sanBongService.saveSanBong(sb);
//    }
}

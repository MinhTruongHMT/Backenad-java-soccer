package com.example.soccerapi.controller;

import com.example.soccerapi.emtity.*;
import com.example.soccerapi.service.BookingService;
import com.example.soccerapi.service.KhachHangService;
import com.example.soccerapi.service.SanBongService;
import com.example.soccerapi.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/khachhangs")
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;
    @Autowired
    private BookingService bookingService;

    @Autowired
    private  SanBongService sanBongService;
    @Autowired
    private SanPhamService sanPhamService;
    @GetMapping("")
    List<KhachHang> getAllKhachHang() {
        return khachHangService.getAllKhachHang();
    }

    @GetMapping("/{id}")
    KhachHangReposense getKHId(@PathVariable int id) {
        return KhachHangReposense.parseKhachHang(khachHangService.getkHid(id));
    }
    @RequestMapping(value = "/greetings", method = RequestMethod.POST, consumes="application/json")
    public  ResponseEntity<Booking> addGreeting(@RequestBody Booking type) {
        return ResponseEntity.status(HttpStatus.OK).body(type);
    }

    @PostMapping("/login")
    ResponseEntity getKhachHang(@RequestBody LoginRequest loginRequest){
        List<KhachHang> list = getAllKhachHang();
        System.out.println(loginRequest.getUserName() + " - " + loginRequest.getPassWord());
        for (KhachHang kh:list) {
            System.out.println(kh.getUserName());
            if((kh.getUserName().equals(loginRequest.getUserName()))&& kh.getPassWord().equals(loginRequest.getPassWord()))
                return ResponseEntity.status(HttpStatus.OK).body(KhachHangReposense.parseKhachHang(kh));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }


//    @GetMapping("/createbooking")
//    public  void  createBooking(){
//       KhachHang kh = khachHangService.getKhById(1);
//       List<SanBong> listSanbong = sanBongService.getAllSanBong();
//       SanBong sb = listSanbong.get(0);
//
//        Booking bk = new Booking(200000,"2022-11-11","20:20","2022-11-12");
//        SanPham sp1 = new SanPham("stings",12000);
//        SanPham sp2 = new SanPham("number one",12000);
//        SanPham sp3 = new SanPham("red Bull",12000);
//
//        sp1.addBooking(bk);
//        sp2.addBooking(bk);
//        sp3.addBooking(bk);
//
//        List<SanPham>listSp =new ArrayList<>();
//        listSp.add(sp1);
//        listSp.add(sp2);
//        listSp.add(sp3);
//
//        kh.addBooking(bk);
//        sb.addBooking(bk);
//
//        bk.setSanPhams(listSp);
//
//        bk.setKhachHang(kh);
//
//        bk.setSanBong(sb);
//
//        bookingService.saveBooking(bk);
//    }

    @GetMapping("/bookings/{id}")
    List<Booking> getAllBookingsIdUaser(@PathVariable int id) {
        KhachHang kh = khachHangService.getKhById(id);
        List<Booking> dsBooking = kh.getBookings();
        return dsBooking;
    }

    @PostMapping(value = "/createbooking")
    ResponseEntity<BookingRequest> createBooking(@RequestBody BookingRequest booking){
        KhachHang kh = khachHangService.getkHid(booking.getId());
        List<SanBong> listSanbong = sanBongService.getAllSanBong();
        SanBong sb = listSanbong.get(0);
        Booking bk = new Booking();
        List<SanPham> listSanPham  = booking.getSanPhams();
        for(SanPham sp : listSanPham){
            SanPham sanPham = sanPhamService.getSanPhamId(sp.getId());
            sanPham.addBookings(bk);
            bk.addSanPhams(sanPham);
        }



        bk.setSanBong(sb);
        bk.setKhachHang(kh);

        kh.addBooking(bk);
        sb.addBooking(bk);
        bookingService.saveBooking(bk);
        return ResponseEntity.status(HttpStatus.OK).body(booking);
    }
}

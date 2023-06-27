package com.example.soccerapi.emtity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "khachhang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "khachhang_id")
    private int id;
    private String userName;
    private String passWord;
    private String phone;

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Booking> bookings;

    public KhachHang() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public KhachHang(String userName, String passWord, String phone) {
        this.userName = userName;
        this.passWord = passWord;
        this.phone = phone;
        this.bookings= new ArrayList<>();

    }

    public boolean addBooking(Booking booking){
      return  this.bookings.add(booking);
    }
}

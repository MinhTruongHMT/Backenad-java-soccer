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
    private String image;
    @OneToMany(mappedBy = "khachHang" ,cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Booking> listBooking;

    public KhachHang() {
    }

    public KhachHang(String userName, String passWord, String phone) {
        this.userName = userName;
        this.passWord = passWord;
        this.phone = phone;
        this.listBooking= new ArrayList<>();
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Booking> getListBooking() {
        return listBooking;
    }

    public void setListBooking(List<Booking> listBooking) {
        this.listBooking = listBooking;
    }

    public  boolean addBooking(Booking booking){
       return this.listBooking.add(booking);
    }
}

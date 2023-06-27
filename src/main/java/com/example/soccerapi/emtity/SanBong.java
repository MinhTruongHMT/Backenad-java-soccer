package com.example.soccerapi.emtity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "sanbong")
public class SanBong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sanbong_id")
    private int id;
    private String name;
    private double price;
    private String diaChi;

    public SanBong() {
    }

    public SanBong(String name, double price, String diaChi) {
        this.name = name;
        this.price = price;
        this.diaChi = diaChi;
        this.bookings = new ArrayList<>();
    }

    @OneToMany(mappedBy = "sanBong", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Booking> bookings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
    public boolean addBooking(Booking booking){
        return  this.bookings.add(booking);
    }
}

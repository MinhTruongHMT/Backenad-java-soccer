package com.example.soccerapi.emtity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "sanpham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private double price;
    private String image;

    public SanPham(String name, double price) {
        this.name = name;
        this.price = price;
        this.bookings = new ArrayList<>();
    }

    @ManyToMany(mappedBy = "sanPhams")
    @JsonIgnore
    private List<Booking> bookings;

    public SanPham() {

    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean addBooking(Booking booking){
        return this.bookings.add(booking);
    }

    public  boolean addBookings(Booking booking){
        return  this.bookings.add(booking);
    }
}

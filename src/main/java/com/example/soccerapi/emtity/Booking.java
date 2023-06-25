package com.example.soccerapi.emtity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private double amountPaid;
    private String paymentDate;
    private String timeSlot;
    private String bookingDate;
    @ManyToOne
    @JoinColumn(name = "khachhang_id",nullable = false,referencedColumnName = "khachhang_id")
    @JsonBackReference
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "sanbong_id",nullable = false,referencedColumnName = "sanbong_id")
    @JsonBackReference
    private SanBong sanBong;
    @ManyToMany( cascade = CascadeType.ALL)
    @JoinTable(name = "booking_sanpham",
            joinColumns = @JoinColumn(name = "booking_id"),
            inverseJoinColumns = @JoinColumn(name="sanpham_id")
    )
    private List<SanPham> listSanPham;

    public Booking() {
    }

    public Booking(double amountPaid, String paymentDate, String timeSlot, String bookingDate) {
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.timeSlot = timeSlot;
        this.bookingDate = bookingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public SanBong getSanBong() {
        return sanBong;
    }

    public void setSanBong(SanBong sanBong) {
        this.sanBong = sanBong;
    }

    public List<SanPham> getListSanPham() {
        return listSanPham;
    }

    public void setListSanPham(List<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }
}

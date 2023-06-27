package com.example.soccerapi.emtity;

import java.util.List;

public class BookingRequest {

    private int id;
    private List<SanPham> sanPhams;
    private double amountPaid;
    private String paymentDate;
    private String timeSlot;
    private String bookingDate;

    public BookingRequest(int id, List<SanPham> sanPhams, double amountPaid, String paymentDate, String timeSlot, String bookingDate) {
        this.id = id;
        this.sanPhams = sanPhams;
        this.amountPaid = amountPaid;
        this.paymentDate = paymentDate;
        this.timeSlot = timeSlot;
        this.bookingDate = bookingDate;
    }

    public BookingRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(List<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
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
}



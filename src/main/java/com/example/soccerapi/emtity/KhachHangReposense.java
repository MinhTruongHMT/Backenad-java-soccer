package com.example.soccerapi.emtity;

import com.example.soccerapi.service.KhachHangService;

public class KhachHangReposense {
    private int id;
    private String userName;
    private String passWord;
    private String phone;
    private String image;

    public  static  KhachHangReposense parseKhachHang(KhachHang khachHang) {
        KhachHangReposense kh = new KhachHangReposense();
        kh.id = khachHang.getId();
        kh.userName = khachHang.getUserName();
        kh.phone = khachHang.getPhone();

        kh.passWord= khachHang.getPassWord();
        return kh;
    }

    public KhachHangReposense() {
    }

    public KhachHangReposense(int id, String userName, String passWord, String phone, String image) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.phone = phone;
        this.image = image;
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
}

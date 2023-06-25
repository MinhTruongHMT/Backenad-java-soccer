package com.example.soccerapi.service;

import com.example.soccerapi.emtity.KhachHang;
import jakarta.transaction.Transactional;

import java.util.List;

public interface KhachHangService {
    @Transactional
    KhachHang saveKhachHang(KhachHang employee);
    List<KhachHang> getAllKhachHang();
    KhachHang getKhById(int id);
    KhachHang getkHid(int id);
}

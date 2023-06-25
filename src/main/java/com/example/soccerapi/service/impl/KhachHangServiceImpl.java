package com.example.soccerapi.service.impl;

import com.example.soccerapi.emtity.KhachHang;
import com.example.soccerapi.repository.KhachHangRepository;
import com.example.soccerapi.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangServiceImpl implements KhachHangService {
    @Autowired
    private KhachHangRepository repository;
    @Override
    public KhachHang saveKhachHang(KhachHang employee) {
        return repository.save(employee);
    }

    @Override
    public List<KhachHang> getAllKhachHang() {
        return repository.findAll();
    }

    @Override
    public KhachHang getKhById(int id) {
        return repository.getReferenceById(id);
    }

    @Override
    public KhachHang getkHid(int id) {
        return repository.findById(id);
    }


}

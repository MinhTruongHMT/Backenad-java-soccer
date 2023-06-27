package com.example.soccerapi.service.impl;

import com.example.soccerapi.emtity.SanPham;
import com.example.soccerapi.repository.SanPhamRepository;
import com.example.soccerapi.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamRepository repository;
    @Override
    public SanPham getSanPhamId(int id) {
        return repository.findById(id);
    }
}

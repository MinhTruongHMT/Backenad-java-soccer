package com.example.soccerapi.service.impl;


import com.example.soccerapi.emtity.SanBong;
import com.example.soccerapi.repository.SanBongRepository;
import com.example.soccerapi.service.SanBongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SanBongServiceImpl implements SanBongService {
    @Autowired
    private SanBongRepository repository;
    @Override
    public SanBong saveSanBong(SanBong sanBong) {
        return repository.save(sanBong);
    }

    @Override
    public List<SanBong> getAllSanBong() {
        return repository.findAll();
    }

    @Override
    public Optional<SanBong> findById(int id) {
        return repository.findById(id);
    }
}





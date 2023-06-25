package com.example.soccerapi.service;


import com.example.soccerapi.emtity.SanBong;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface SanBongService {
    @Transactional
    SanBong saveSanBong(SanBong sanBong);

    List<SanBong> getAllSanBong();

    Optional<SanBong> findById (int id);

}

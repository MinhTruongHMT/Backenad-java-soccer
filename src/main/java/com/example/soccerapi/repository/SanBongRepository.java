package com.example.soccerapi.repository;


import com.example.soccerapi.emtity.SanBong;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SanBongRepository extends JpaRepository<SanBong, Integer> {
    Optional<SanBong> findById(int id);

}

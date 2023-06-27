package com.example.soccerapi.repository;

import com.example.soccerapi.emtity.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanPhamRepository extends JpaRepository<SanPham,Integer> {
    SanPham findById(int id);
}

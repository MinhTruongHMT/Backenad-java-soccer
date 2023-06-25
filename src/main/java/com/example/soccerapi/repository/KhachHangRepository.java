package com.example.soccerapi.repository;

import com.example.soccerapi.emtity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
    KhachHang findById(int id);
}

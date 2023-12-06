package com.example.appz_lr4.repositories;

import com.example.appz_lr4.model.MobileDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileDeviceRepository extends JpaRepository<MobileDevice, Integer> {
    List<MobileDevice> findAll();
}

package com.example.appz_lr4.services;

import com.example.appz_lr4.model.MobileDevice;
import com.example.appz_lr4.repositories.MobileDeviceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MobileDeviceService {
    private final MobileDeviceRepository repository;

    public List<MobileDevice> findAll(){
        return  repository.findAll();
    }
}

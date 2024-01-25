package com.todocodeacademy.hotelsservice.service;

import com.todocodeacademy.hotelsservice.model.Hotel;
import com.todocodeacademy.hotelsservice.repository.IHotelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelsService implements IHotelsService{

    @Autowired
    IHotelsRepository hotelsRepository;


    @Override
    public List<Hotel> getHotelsForCity(Long id_ciudad) {
        return hotelsRepository.findByCity(id_ciudad);
    }
}

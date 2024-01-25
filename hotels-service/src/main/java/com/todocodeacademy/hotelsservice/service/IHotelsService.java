package com.todocodeacademy.hotelsservice.service;

import com.todocodeacademy.hotelsservice.model.Hotel;

import java.util.List;

public interface IHotelsService {

    List<Hotel> getHotelsForCity (Long id_ciudad);
}

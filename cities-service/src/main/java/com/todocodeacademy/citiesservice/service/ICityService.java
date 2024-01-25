package com.todocodeacademy.citiesservice.service;

import com.todocodeacademy.citiesservice.dto.CityDTO;
import com.todocodeacademy.citiesservice.model.City;

public interface ICityService {

    CityDTO traerCiudadPorNombreyPais (String nombre, String pais);


}

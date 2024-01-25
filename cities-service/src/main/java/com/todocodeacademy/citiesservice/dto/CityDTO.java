package com.todocodeacademy.citiesservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class CityDTO {
    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;
    private List<HotelDTO> hotelList;
}

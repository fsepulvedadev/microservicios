package com.todocodeacademy.citiesservice.dto;

import lombok.Data;

@Data
public class HotelDTO {
    private Long id;
    private String name;
    private Long stars;
    private Long city_id;
}

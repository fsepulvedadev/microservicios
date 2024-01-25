package com.todocodeacademy.citiesservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long city_id;

    private String name;
    private String continent;
    private String country;
    private String state;


}

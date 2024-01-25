package com.todocodeacademy.hotelsservice.repository;

import com.todocodeacademy.hotelsservice.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHotelsRepository extends JpaRepository<Hotel, Long> {

    @Query("SELECT h FROM Hotel h WHERE :id_ciudad = h.id_ciudad")
    List<Hotel> findByCity (@Param("id_ciudad") Long id_ciudad);


}

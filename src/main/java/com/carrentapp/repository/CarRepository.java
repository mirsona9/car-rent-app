package com.carrentapp.repository;

import com.carrentapp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    //                      s > en  ||  e < st
    // ------------|-----|--|---------------|------|-----|-------
    //				        s               e
    @Query("from Car c where ((:vehicle is not Null and (c.brand like %:vehicle% or c.model like %:vehicle%)) or (1=1))  and " +
            " ((:pickup is not null and :dropoff is not null and c.id in (select r.id from Reservation r where (:pickup > r.dropOffDate or :dropoff < r.pickUpDate))) or (1=1))  ")
    List<Car> getCarsByFilter(@Param("vehicle") String vehicle, @Param("pickup") LocalDate pickUp, @Param("dropoff") LocalDate dropOff);
}

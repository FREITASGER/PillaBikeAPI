package com.svalero.pillaBike.service;

import com.svalero.pillaBike.domain.Bike;
import com.svalero.pillaBike.domain.Parking;
import com.svalero.pillaBike.exception.BikeNotFoundException;
import com.svalero.pillaBike.exception.ParkingNotFoundException;

import java.util.List;

public interface BikeService {

    Bike addBike(Bike bike, long parkingId) throws ParkingNotFoundException;
    void deleteBike(long id) throws BikeNotFoundException;
    Bike modifyBike(long id, Bike newBike) throws BikeNotFoundException;
    List<Bike> findAll();
    List<Bike> findByParking(Parking parking);
    Bike findById(long id) throws BikeNotFoundException;
}

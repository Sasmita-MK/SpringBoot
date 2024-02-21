package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.demo.model.FlightBooking;
@Repository
public interface FlightRepo extends JpaRepository<FlightBooking,Integer>{
}

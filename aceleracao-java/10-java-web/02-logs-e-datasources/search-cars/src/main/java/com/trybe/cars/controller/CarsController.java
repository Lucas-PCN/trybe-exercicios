package com.trybe.cars.controller;

import com.trybe.cars.model.Car;
import com.trybe.cars.service.CarsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe CarsController.
 * 
 */
@RestController
@RequestMapping("/cars")
public class CarsController {

  @Autowired
  private CarsService carsService;

  @GetMapping
  public ResponseEntity<List<Car>> getAllCars() {
    return ResponseEntity.ok().body(carsService.getAllCars());
  }

}

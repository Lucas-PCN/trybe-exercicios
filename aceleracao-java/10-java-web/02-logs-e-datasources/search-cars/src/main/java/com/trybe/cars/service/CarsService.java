package com.trybe.cars.service;

import com.trybe.cars.model.Car;
import com.trybe.cars.repository.CarsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Classe CarsService.
 * 
 */
@Service
public class CarsService {

  @Autowired
  private CarsRepository carsRepository;

  public List<Car> getAllCars() {
    return carsRepository.findAll();
  }

}

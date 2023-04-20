package com.trybe.cars.repository;

import com.trybe.cars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface CarsRepository.
 */
@Repository
public interface CarsRepository extends JpaRepository<Car, Long> {

}

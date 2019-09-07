package com.bikeyxe.bikes.bicycle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicycleRepository extends CrudRepository<Bicycle, Long> {

}

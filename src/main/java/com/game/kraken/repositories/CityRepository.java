package com.game.kraken.repositories;

import com.game.kraken.entities.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cities")
public interface CityRepository extends CrudRepository<City, Long> {
}

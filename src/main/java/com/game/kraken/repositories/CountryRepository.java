package com.game.kraken.repositories;

import com.game.kraken.entities.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "countries")
public interface CountryRepository extends CrudRepository<Country, Long> {
}

package com.masdefect.repository;

import com.masdefect.domain.entities.Planet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {

    Planet findByName(String homePlanet);
}

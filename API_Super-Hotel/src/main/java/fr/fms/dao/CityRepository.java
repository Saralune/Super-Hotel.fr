package fr.fms.dao;

import fr.fms.entities.City;
import fr.fms.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository  extends JpaRepository<City, Long> {
    List<City> findByNameContains(String description);
}

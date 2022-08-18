package fr.fms.business;

import fr.fms.dao.CityRepository;
import fr.fms.entities.City;
import fr.fms.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityBusinessImpl implements Business<City> {
    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public City saveOrUpdateOne(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void deleteOne(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public Optional<City> readOneById(Long id) {
        return cityRepository.findById(id);
    }

    public List<City> readHotelsByNameContains(String description) throws Exception{
        return cityRepository.findByNameContains(description);
    }
}

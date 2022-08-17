package fr.fms.web;

import fr.fms.business.CityBusinessImpl;
import fr.fms.entities.City;
import fr.fms.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityBusinessImpl cityBusiness;

    @GetMapping("/all")
    public List<City> getAllCities(){
        return cityBusiness.findAll();
    }

    @GetMapping("/{id}")
    public City getCity(@PathVariable("id") Long id) throws Exception{
        Optional<City> city = cityBusiness.readOneById(id);
        return city.orElse(null);
    }

    @GetMapping("/{id}/hotels")
    public List<Hotel> getHotelsByCity(@PathVariable("id") Long id) throws Exception{
        Optional<City> city = cityBusiness.readOneById(id);
        return city.orElse(null).getHotels();
    }

    @PostMapping("/saveCity")
    public void saveOrUpdate(@RequestBody City city){
        cityBusiness.saveOrUpdateOne(city);
    }

    @PostMapping("/delete/{id}")
    public void deleteCity(@PathVariable("id") Long id) throws Exception{
        cityBusiness.deleteOne(id);
    }
}

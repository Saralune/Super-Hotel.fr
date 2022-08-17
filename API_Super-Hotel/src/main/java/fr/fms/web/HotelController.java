package fr.fms.web;

import fr.fms.business.HotelBusinessImpl;
import fr.fms.entities.City;
import fr.fms.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelBusinessImpl hotelBusiness;

    @GetMapping("/all")
    public List<Hotel> getAllCities(){
        return hotelBusiness.findAll();
    }
}

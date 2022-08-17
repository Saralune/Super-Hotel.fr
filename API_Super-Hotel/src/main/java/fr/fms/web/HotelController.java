package fr.fms.web;

import fr.fms.business.HotelBusinessImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelBusinessImpl hotelBusiness;

    @GetMapping("/")
    public void truc(){
    }
}

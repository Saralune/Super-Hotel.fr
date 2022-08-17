package fr.fms.web;

import fr.fms.business.UsersBusinessImpl;
import fr.fms.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersBusinessImpl usersBusiness;

    @PostMapping("/register")
    public void register(@RequestBody Users users){
        usersBusiness.saveOrUpdateOne(users);
    }

}

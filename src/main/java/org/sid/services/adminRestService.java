package org.sid.services;

import org.sid.Dao.adminRepository;
import org.sid.entities.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class adminRestService {
    @Autowired
    private adminRepository adminRepository;

    @RequestMapping(value = "/admins" ,method= RequestMethod.POST)
    public admin saveAdmin(@RequestBody admin a){
        return adminRepository.save(a);
    }

    @RequestMapping(value = "/admins/{id}" ,method= RequestMethod.GET)
    public Optional<admin> getAdmin(@PathVariable Long id){
        return adminRepository.findById(id);
    }

    @RequestMapping(value = "/admins" ,method= RequestMethod.GET)
    public List<admin> getAdmin(){
        return adminRepository.findAll();
    }

}

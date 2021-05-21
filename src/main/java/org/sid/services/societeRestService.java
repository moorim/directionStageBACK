package org.sid.services;

import org.sid.entities.societe;
import org.sid.metier.societemetierImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class societeRestService {
    @Autowired
    private societemetierImp entrepriseRepository;
    @RequestMapping(value = "/societes", method = RequestMethod.GET)
    public List<societe> getIdentreprise(){
        return entrepriseRepository.getsociete();
    }

    @RequestMapping(value = "/societes", method = RequestMethod.POST)
    public societe save(@RequestBody societe e){
        return entrepriseRepository.savesociete(e);
    }

    @RequestMapping(value = "/societes/{id}", method = RequestMethod.DELETE)
    public boolean supprimer(@PathVariable Long s) {
        entrepriseRepository.deletesociete(s);
        return true;
    }

    @RequestMapping(value = "/entreprise/{rais_soc}", method = RequestMethod.PUT)
    public societe modifier(@PathVariable Long rais_soc, @RequestBody societe e) {
        e.setRais_soc(rais_soc);
        return entrepriseRepository.savesociete(e);
    }

    @RequestMapping(value = "/countsocietes", method = RequestMethod.GET)
    public Long count() {
        return entrepriseRepository.count();
    }

}
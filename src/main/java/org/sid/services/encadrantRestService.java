package org.sid.services;

import org.sid.entities.encadrant;
import org.sid.metier.encadrantmetierImp;
import org.sid.metier.etudiantmetierImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class encadrantRestService {
    @Autowired
    private encadrantmetierImp encadrantmetierImp;

    @RequestMapping(value = "/encadrants" ,method= RequestMethod.POST)
    public encadrant saveEncadrant(@RequestBody encadrant e){return encadrantmetierImp.saveEncadrant(e);}

    @RequestMapping(value = "/encadrants" ,method= RequestMethod.GET)
    public List<encadrant> getEncadrant(){return  encadrantmetierImp.getEncadrant();}

    @RequestMapping(value = "/encadrants/{id}" ,method= RequestMethod.DELETE)
    public void deleteEncadrant(@PathVariable Long id){encadrantmetierImp.deleteEncadrant(id);}

    @RequestMapping(value = "/encadrants/{id}" ,method= RequestMethod.PUT)
    public void modifyEncadrant(@PathVariable Long id,@RequestBody encadrant e){encadrantmetierImp.modifyEncadrant(id,e);}

    @RequestMapping(value = "/encadrants/{id}" ,method= RequestMethod.GET)
    public encadrant getEncadrantById(@PathVariable Long id){return encadrantmetierImp.getEncadrantById(id);}

    @RequestMapping(value = "/countencadrants" ,method= RequestMethod.GET)
    public Long count() {
        return encadrantmetierImp.count();
    }
}

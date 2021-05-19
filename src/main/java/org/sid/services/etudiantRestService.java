package org.sid.services;

import org.sid.entities.etudiant;
import org.sid.metier.etudiantmetierImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class etudiantRestService {
    @Autowired
    private etudiantmetierImp etudiantmetierImp;

    @RequestMapping(value = "/etudiants" ,method= RequestMethod.POST)
    public etudiant saveEtudiant(@RequestBody etudiant e){return etudiantmetierImp.saveEtudiant(e);}

    @RequestMapping(value = "/etudiants" ,method= RequestMethod.GET)
    public List<etudiant> getEtudiant(){ return etudiantmetierImp.getEtudiant();}

    @RequestMapping(value = "/etudiants/{id}" ,method= RequestMethod.DELETE)
    public void deleteEtudiant(@PathVariable Long id){ etudiantmetierImp.deleteEtudiant(id);}

    @RequestMapping(value = "/etudiants/{id}" ,method= RequestMethod.PUT)
    public void modifyEtudiant(@PathVariable Long id,@RequestBody etudiant e){ etudiantmetierImp.modifyEtudiant(id,e); }

    @RequestMapping(value = "/etudiants/{id}" ,method= RequestMethod.GET)
    public etudiant getEtudiantById(@PathVariable Long id){return etudiantmetierImp.getEtudiantById(id);}
}

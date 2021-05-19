package org.sid.services;

import org.sid.entities.stage;
import org.sid.metier.stagemetierImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class stageRestService {
    @Autowired
    private stagemetierImp stagemetierImp;

    @RequestMapping(value = "/stages" ,method= RequestMethod.POST)
    public stage savestage(@RequestBody stage s){
        return stagemetierImp.savestage(s);
    }

    @RequestMapping(value = "/stages" ,method= RequestMethod.GET)
    public List<stage> getstages(){
        return stagemetierImp.getstages();
    }
    @RequestMapping(value = "/stages/{id}" ,method= RequestMethod.DELETE)
    public void deletestage(@PathVariable Long id){
        stagemetierImp.deletestage(id);
    }

    @RequestMapping(value = "/stages/{id}" ,method= RequestMethod.PUT)
    public void modifystage(@PathVariable Long id,@RequestBody stage s){ stagemetierImp.modifystage(id,s);}

    @RequestMapping(value = "/stages/{id}" ,method= RequestMethod.GET)
    public stage getStageById(@PathVariable Long id){return  stagemetierImp.getStageById(id);}
    @RequestMapping(value = "/countstages" ,method= RequestMethod.GET)
    public Long count(){return  stagemetierImp.countStage();}
}

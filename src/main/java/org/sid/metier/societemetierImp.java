package org.sid.metier;

import org.sid.Dao.societeRepository;
import org.sid.entities.societe;
import org.sid.exception.SocieteNotFoundException;
import org.sid.exception.StageNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("societeService")
public class societemetierImp implements societemetier{
    @Autowired
    private societeRepository societeRepository;

    @Override
    public societe savesociete(societe e) {
       return societeRepository.save(e);
    }

    @Override
    public List<societe> getsociete() {
        return societeRepository.findAll();
    }

    @Override
    public void deletesociete(Long id) {
      societeRepository.deleteById(id);
    }

    @Override
    public void modifysociete(Long id, societe e) {
        e.setRais_soc(id);
         societeRepository.save(e);
    }

    @Override
    public societe getsocieteById(Long id) {
        return societeRepository.findById(id).orElseThrow(()->new SocieteNotFoundException("Stageby id"+id+"not found"));
    }

    @Override
    public Long count() {
        return societeRepository.count();
    }
}

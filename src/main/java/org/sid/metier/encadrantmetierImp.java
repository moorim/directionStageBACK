package org.sid.metier;

import org.sid.Dao.encadrantRepository;
import org.sid.Dao.etudiantRepository;
import org.sid.entities.encadrant;
import org.sid.exception.EncadrantNotFoundException;
import org.sid.exception.StageNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("encadrantService")
public class encadrantmetierImp implements encadrantmetier{
    @Autowired
    private encadrantRepository encadrantRepository;

    @Override
    public encadrant saveEncadrant(encadrant e) {
        return encadrantRepository.save(e);
    }

    @Override
    public List<encadrant> getEncadrant() {
        return encadrantRepository.findAll();
    }

    @Override
    public void deleteEncadrant(Long id) {
         encadrantRepository.deleteById(id);
    }

    @Override
    public void modifyEncadrant(Long id, encadrant e) {
      e.setId(id);
      encadrantRepository.save(e);
    }

    @Override
    public encadrant getEncadrantById(Long id) {
        return encadrantRepository.findById(id).
                orElseThrow(()->new EncadrantNotFoundException("Stageby id"+id+"not found"));
    }

    @Override
    public Long count() {
        return encadrantRepository.count();
    }
}

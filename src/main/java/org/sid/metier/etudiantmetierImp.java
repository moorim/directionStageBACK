package org.sid.metier;

import org.sid.Dao.etudiantRepository;
import org.sid.entities.etudiant;
import org.sid.exception.EtudiantNotFoundException;
import org.sid.exception.StageNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("etudiantService")
public class etudiantmetierImp implements etudiantmetier{
    @Autowired
    private etudiantRepository etudiantRepository;
    @Override
    public etudiant saveEtudiant(etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public List<etudiant> getEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public void modifyEtudiant(Long id, etudiant e) {
        e.setId(id);
        etudiantRepository.save(e);
    }

    @Override
    public etudiant getEtudiantById(Long id) {
        return etudiantRepository.findById(id).orElseThrow(()->new EtudiantNotFoundException("Stageby id"+id+"not found"));
    }
}

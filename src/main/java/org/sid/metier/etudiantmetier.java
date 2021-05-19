package org.sid.metier;

import org.sid.entities.etudiant;
import org.sid.entities.stage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("etudiantService")
public interface etudiantmetier {
    public etudiant saveEtudiant(etudiant e);
    public List<etudiant> getEtudiant();
    public void deleteEtudiant(Long id);
    public void modifyEtudiant(Long id,etudiant e);
    public etudiant getEtudiantById(Long id);
}

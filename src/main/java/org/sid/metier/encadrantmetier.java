package org.sid.metier;

import org.sid.entities.encadrant;
import org.sid.entities.etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("encadrantService")
public interface encadrantmetier {
    public encadrant saveEncadrant(encadrant e);
    public List<encadrant> getEncadrant();
    public void deleteEncadrant(Long id);
    public void modifyEncadrant(Long id,encadrant e);
    public encadrant getEncadrantById(Long id);
    public Long count();
}

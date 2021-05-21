package org.sid.metier;


import org.sid.entities.societe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("societeService")
public interface societemetier {
    public societe savesociete(societe e);
    public List<societe> getsociete();
    public void deletesociete(Long id);
    public void modifysociete(Long id,societe e);
    public societe getsocieteById(Long id);
    public Long count();
}

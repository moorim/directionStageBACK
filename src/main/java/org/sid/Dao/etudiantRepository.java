package org.sid.Dao;

import org.sid.entities.etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface etudiantRepository extends JpaRepository<etudiant,Long> {
}

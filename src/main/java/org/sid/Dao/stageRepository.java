package org.sid.Dao;

import org.sid.entities.encadrant;
import org.sid.entities.stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface stageRepository extends JpaRepository<stage,Long> {

}

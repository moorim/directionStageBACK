package org.sid.Dao;

import org.sid.entities.encadrant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface encadrantRepository extends JpaRepository<encadrant,Long> {

}

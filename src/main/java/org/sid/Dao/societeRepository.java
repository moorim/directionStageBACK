package org.sid.Dao;

import org.sid.entities.societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface societeRepository extends JpaRepository<societe,Long> {
}

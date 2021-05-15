package org.sid.Dao;

import org.sid.entities.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface adminRepository extends JpaRepository<admin,Long> {
}

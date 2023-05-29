
package com.proyecto.demo.repositories;

import com.proyecto.demo.entities.General;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralRepository extends JpaRepository<General, Long> {
    
}

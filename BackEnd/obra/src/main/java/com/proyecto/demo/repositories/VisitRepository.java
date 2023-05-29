
package com.proyecto.demo.repositories;

import com.proyecto.demo.entities.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends JpaRepository<Visit, Long> {
    
}

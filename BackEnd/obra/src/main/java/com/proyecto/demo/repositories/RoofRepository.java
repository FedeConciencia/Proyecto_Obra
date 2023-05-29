
package com.proyecto.demo.repositories;

import com.proyecto.demo.entities.Roof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoofRepository extends JpaRepository<Roof, Long> {
    
}

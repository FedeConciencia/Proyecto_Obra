
package com.proyecto.demo.repositories;

import com.proyecto.demo.entities.Structure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StructureRepository extends JpaRepository<Structure, Long>{
    
}

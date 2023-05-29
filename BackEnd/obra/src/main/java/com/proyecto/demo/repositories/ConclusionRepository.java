
package com.proyecto.demo.repositories;

import com.proyecto.demo.entities.Conclusion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConclusionRepository extends JpaRepository<Conclusion, Long> {
    
}

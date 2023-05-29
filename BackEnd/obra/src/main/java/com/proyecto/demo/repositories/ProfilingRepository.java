
package com.proyecto.demo.repositories;

import com.proyecto.demo.entities.Profiling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfilingRepository extends JpaRepository<Profiling, Long> {
    
}

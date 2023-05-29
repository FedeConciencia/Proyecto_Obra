
package com.proyecto.demo.repositories;

import com.proyecto.demo.entities.Wall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallRepository extends JpaRepository<Wall, Long> {
    
}

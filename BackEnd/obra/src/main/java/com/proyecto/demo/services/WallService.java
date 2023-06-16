
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Wall;
import com.proyecto.demo.repositories.WallRepository;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

@Service
public class WallService implements BaseService<Wall> {
    
    @Autowired
    private WallRepository wallRepository;
    
    @Override 
    @Transactional
    public List<Wall> listResources() throws Exception {
        
        try{
            
            return wallRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Wall readResource(Long id) throws Exception{
        
        try{
            
            Optional<Wall> entityOptional = wallRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Wall createResource(Wall entity) throws Exception{
        
        try{
            
            Wall wall = wallRepository.save(entity);
            
            return wall;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Wall updateResource(Long id, Wall entity) throws Exception{
        
        try{
            
            Optional<Wall> entityOptional = wallRepository.findById(id);
            
            Wall wall = entityOptional.get();
             
            wall = wallRepository.save(entity);
            
            return wall;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(wallRepository.existsById(id)){
                
                wallRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    
   @Override
   @Transactional
   public Wall updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Wall> entityOptional = wallRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Wall.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return wallRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}

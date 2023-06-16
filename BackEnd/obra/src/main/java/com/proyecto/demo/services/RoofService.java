
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Roof;
import com.proyecto.demo.repositories.RoofRepository;
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
public class RoofService implements BaseService<Roof> {
    
    @Autowired
    private RoofRepository roofRepository;
    
    @Override 
    @Transactional
    public List<Roof> listResources() throws Exception {
        
        try{
            
            return roofRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Roof readResource(Long id) throws Exception{
        
        try{
            
            Optional<Roof> entityOptional = roofRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Roof createResource(Roof entity) throws Exception{
        
        try{
            
            Roof roof = roofRepository.save(entity);
            
            return roof;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Roof updateResource(Long id, Roof entity) throws Exception{
        
        try{
            
            Optional<Roof> entityOptional = roofRepository.findById(id);
            
            Roof roof = entityOptional.get();
             
            roof = roofRepository.save(entity);
            
            return roof;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(roofRepository.existsById(id)){
                
                roofRepository.deleteById(id);
                
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
   public Roof updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Roof> entityOptional = roofRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Roof.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return roofRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}


package com.proyecto.demo.services;

import com.proyecto.demo.entities.Conclusion;
import com.proyecto.demo.repositories.ConclusionRepository;
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
public class ConclusionService implements BaseService<Conclusion> {
    
    @Autowired
    private ConclusionRepository conclusionRepository;
    
    @Override 
    @Transactional
    public List<Conclusion> listResources() throws Exception {
        
        try{
            
            return conclusionRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Conclusion readResource(Long id) throws Exception{
        
        try{
            
            Optional<Conclusion> entityOptional = conclusionRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Conclusion createResource(Conclusion entity) throws Exception{
        
        try{
            
            Conclusion camera = conclusionRepository.save(entity);
            
            return camera;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Conclusion updateResource(Long id, Conclusion entity) throws Exception{
        
        try{
            
            Optional<Conclusion> entityOptional = conclusionRepository.findById(id);
            
            Conclusion conclusion = entityOptional.get();
             
            conclusion = conclusionRepository.save(entity);
            
            return conclusion;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(conclusionRepository.existsById(id)){
                
                conclusionRepository.deleteById(id);
                
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
   public Conclusion updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Conclusion> entityOptional = conclusionRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Conclusion.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return conclusionRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}

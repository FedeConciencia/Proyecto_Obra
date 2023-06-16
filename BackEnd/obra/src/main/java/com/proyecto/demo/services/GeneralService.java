
package com.proyecto.demo.services;


import com.proyecto.demo.entities.General;
import com.proyecto.demo.repositories.GeneralRepository;
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
public class GeneralService implements BaseService<General> {
    
    @Autowired
    private GeneralRepository generalRepository;
    
    @Override 
    @Transactional
    public List<General> listResources() throws Exception {
        
        try{
            
            return generalRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public General readResource(Long id) throws Exception{
        
        try{
            
            Optional<General> entityOptional = generalRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public General createResource(General entity) throws Exception{
        
        try{
            
            General general = generalRepository.save(entity);
            
            return general;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public General updateResource(Long id, General entity) throws Exception{
        
        try{
            
            Optional<General> entityOptional = generalRepository.findById(id);
            
            General general = entityOptional.get();
             
            general = generalRepository.save(entity);
            
            return general;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(generalRepository.existsById(id)){
                
                generalRepository.deleteById(id);
                
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
   public General updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<General> entityOptional = generalRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(General.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return generalRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}

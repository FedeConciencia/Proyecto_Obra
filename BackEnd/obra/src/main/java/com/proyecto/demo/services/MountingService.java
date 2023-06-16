
package com.proyecto.demo.services;

import com.proyecto.demo.entities.Mounting;
import com.proyecto.demo.repositories.MountingRepository;
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
public class MountingService implements BaseService<Mounting> {
    
    @Autowired
    private MountingRepository mountingRespository;
    
    @Override 
    @Transactional
    public List<Mounting> listResources() throws Exception {
        
        try{
            
            return mountingRespository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Mounting readResource(Long id) throws Exception{
        
        try{
            
            Optional<Mounting> entityOptional = mountingRespository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Mounting createResource(Mounting entity) throws Exception{
        
        try{
            
            Mounting mounting = mountingRespository.save(entity);
            
            return mounting;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Mounting updateResource(Long id, Mounting entity) throws Exception{
        
        try{
            
            Optional<Mounting> entityOptional = mountingRespository.findById(id);
            
            Mounting mounting = entityOptional.get();
             
            mounting = mountingRespository.save(entity);
            
            return mounting;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(mountingRespository.existsById(id)){
                
                mountingRespository.deleteById(id);
                
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
   public Mounting updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Mounting> entityOptional = mountingRespository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Mounting.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return mountingRespository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}


package com.proyecto.demo.services;


import com.proyecto.demo.entities.Visit;
import com.proyecto.demo.repositories.VisitRepository;
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
public class VisitService implements BaseService<Visit> {
    
    @Autowired
    private VisitRepository visitRepository;
    
    
    @Override 
    @Transactional
    public List<Visit> listResources() throws Exception {
        
        try{
            
            return visitRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Visit readResource(Long id) throws Exception{
        
        try{
            
            Optional<Visit> entityOptional = visitRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Visit createResource(Visit entity) throws Exception{
        
        try{
            
            Visit visit = visitRepository.save(entity);
            
            return visit;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Visit updateResource(Long id, Visit entity) throws Exception{
        
        try{
            
            Optional<Visit> entityOptional = visitRepository.findById(id);
            
            Visit visit = entityOptional.get();
             
            visit = visitRepository.save(entity);
            
            return visit;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(visitRepository.existsById(id)){
                
                visitRepository.deleteById(id);
                
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
   public Visit updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Visit> entityOptional = visitRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Visit.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return visitRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}

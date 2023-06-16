
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Subject;
import com.proyecto.demo.repositories.SubjectRepository;
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
public class SubjectService implements BaseService<Subject> {
    
    @Autowired
    private SubjectRepository subjectRepository;
    
    @Override 
    @Transactional
    public List<Subject> listResources() throws Exception {
        
        try{
            
            return subjectRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Subject readResource(Long id) throws Exception{
        
        try{
            
            Optional<Subject> entityOptional = subjectRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Subject createResource(Subject entity) throws Exception{
        
        try{
            
            Subject subject = subjectRepository.save(entity);
            
            return subject;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Subject updateResource(Long id, Subject entity) throws Exception{
        
        try{
            
            Optional<Subject> entityOptional = subjectRepository.findById(id);
            
            Subject subject = entityOptional.get();
             
            subject = subjectRepository.save(entity);
            
            return subject;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(subjectRepository.existsById(id)){
                
                subjectRepository.deleteById(id);
                
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
   public Subject updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Subject> entityOptional = subjectRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Subject.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return subjectRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
}


package com.proyecto.demo.services;

import com.proyecto.demo.entities.Person;
import com.proyecto.demo.repositories.PersonRepository;
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
public class PersonService implements BaseService<Person> {
    
    @Autowired
    private PersonRepository personRepository;
    
    @Override 
    @Transactional
    public List<Person> listResources() throws Exception {
        
        try{
            
            return personRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Person readResource(Long id) throws Exception{
        
        try{
            
            Optional<Person> entityOptional = personRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Person createResource(Person entity) throws Exception{
        
        try{
            
            Person person = personRepository.save(entity);
            
            return person;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Person updateResource(Long id, Person entity) throws Exception{
        
        try{
            
            Optional<Person> entityOptional = personRepository.findById(id);
            
            Person person = entityOptional.get();
             
            person = personRepository.save(entity);
            
            return person;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(personRepository.existsById(id)){
                
                personRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    
   
   
   @Transactional
   public Person deleteLogicResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Person> entityOptional = personRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Person.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return personRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
    
    
    
}


package com.proyecto.demo.services;


import com.proyecto.demo.entities.Structure;
import com.proyecto.demo.repositories.StructureRepository;
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
public class StructureService implements BaseService<Structure> {
    
    @Autowired
    private StructureRepository structureRepository;
    
    @Override 
    @Transactional
    public List<Structure> listResources() throws Exception {
        
        try{
            
            return structureRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Structure readResource(Long id) throws Exception{
        
        try{
            
            Optional<Structure> entityOptional = structureRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Structure createResource(Structure entity) throws Exception{
        
        try{
            
            Structure structure = structureRepository.save(entity);
            
            return structure;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Structure updateResource(Long id, Structure entity) throws Exception{
        
        try{
            
            Optional<Structure> entityOptional = structureRepository.findById(id);
            
            Structure structure = entityOptional.get();
             
            structure = structureRepository.save(entity);
            
            return structure;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(structureRepository.existsById(id)){
                
                structureRepository.deleteById(id);
                
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
   public Structure updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Structure> entityOptional = structureRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Structure.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return structureRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}

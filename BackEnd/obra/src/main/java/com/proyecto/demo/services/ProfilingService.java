
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Profiling;
import com.proyecto.demo.repositories.ProfilingRepository;
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
public class ProfilingService implements BaseService<Profiling> {
    
    @Autowired
    private ProfilingRepository profilingRepository;
    
    @Override 
    @Transactional
    public List<Profiling> listResources() throws Exception {
        
        try{
            
            return profilingRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Profiling readResource(Long id) throws Exception{
        
        try{
            
            Optional<Profiling> entityOptional = profilingRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Profiling createResource(Profiling entity) throws Exception{
        
        try{
            
            Profiling profiling = profilingRepository.save(entity);
            
            return profiling;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Profiling updateResource(Long id, Profiling entity) throws Exception{
        
        try{
            
            Optional<Profiling> entityOptional = profilingRepository.findById(id);
            
            Profiling profiling = entityOptional.get();
             
            profiling = profilingRepository.save(entity);
            
            return profiling;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(profilingRepository.existsById(id)){
                
                profilingRepository.deleteById(id);
                
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
   public Profiling updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Profiling> entityOptional = profilingRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Profiling.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return profilingRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
}

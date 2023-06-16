
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Material;
import com.proyecto.demo.repositories.MaterialRepository;
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
public class MaterialService implements BaseService<Material> {
    
    @Autowired
    private MaterialRepository materialRepository;
    
    @Override 
    @Transactional
    public List<Material> listResources() throws Exception {
        
        try{
            
            return materialRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Material readResource(Long id) throws Exception{
        
        try{
            
            Optional<Material> entityOptional = materialRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Material createResource(Material entity) throws Exception{
        
        try{
            
            Material material = materialRepository.save(entity);
            
            return material;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Material updateResource(Long id, Material entity) throws Exception{
        
        try{
            
            Optional<Material> entityOptional = materialRepository.findById(id);
            
            Material material = entityOptional.get();
             
            material = materialRepository.save(entity);
            
            return material;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(materialRepository.existsById(id)){
                
                materialRepository.deleteById(id);
                
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
   public Material updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Material> entityOptional = materialRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Material.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return materialRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
   
}

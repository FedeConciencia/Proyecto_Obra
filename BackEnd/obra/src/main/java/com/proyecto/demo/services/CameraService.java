
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Camera;
import com.proyecto.demo.repositories.CameraRepository;
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
public class CameraService implements BaseService<Camera> {
    
    @Autowired
    private CameraRepository cameraRepository;
    
    @Override 
    @Transactional
    public List<Camera> listResources() throws Exception {
        
        try{
            
            return cameraRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Camera readResource(Long id) throws Exception{
        
        try{
            
            Optional<Camera> entityOptional = cameraRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Camera createResource(Camera entity) throws Exception{
        
        try{
            
            Camera camera = cameraRepository.save(entity);
            
            return camera;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Camera updateResource(Long id, Camera entity) throws Exception{
        
        try{
            
            Optional<Camera> entityOptional = cameraRepository.findById(id);
            
            Camera camera = entityOptional.get();
             
            camera = cameraRepository.save(entity);
            
            return camera;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(cameraRepository.existsById(id)){
                
                cameraRepository.deleteById(id);
                
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
   public Camera updateFieldResource(Long id, Map<String, String> fields) throws Exception{
       
        try{
            
            Optional<Camera> entityOptional = cameraRepository.findById(id);
            
            if(entityOptional.isPresent()){
                
  
                fields.forEach((key,value) -> {
                        
                    Field field = ReflectionUtils.findField(Camera.class, key);
                    
                    field.setAccessible(true);
                    
                    if (field.getAnnotatedType().getType().equals(LocalDate.class)) {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), LocalDate.parse(value));
                    
                    } else {
                        
                        ReflectionUtils.setField(field, entityOptional.get(), value);
                        
                    }
                    
                       
                });
                
                
               return cameraRepository.save(entityOptional.get());
               
               
            }else{
                
                return null;
                
            }
            
        }catch(Exception e){

            throw new Exception(e.getMessage());

        }
       
       
   }
    
    
}

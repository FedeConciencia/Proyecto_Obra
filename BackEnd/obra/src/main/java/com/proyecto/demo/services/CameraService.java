
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Camera;
import com.proyecto.demo.repositories.CameraRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
    
    
}

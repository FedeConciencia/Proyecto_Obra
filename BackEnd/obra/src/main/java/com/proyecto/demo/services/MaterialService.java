
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Material;
import com.proyecto.demo.repositories.MaterialRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
    
    
}

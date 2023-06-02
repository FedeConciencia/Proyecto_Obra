
package com.proyecto.demo.services;

import com.proyecto.demo.entities.Mounting;
import com.proyecto.demo.repositories.MountingRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
}


package com.proyecto.demo.services;


import com.proyecto.demo.entities.Roof;
import com.proyecto.demo.repositories.RoofRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoofService implements BaseService<Roof> {
    
    @Autowired
    private RoofRepository roofRepository;
    
    @Override 
    @Transactional
    public List<Roof> listResources() throws Exception {
        
        try{
            
            return roofRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Roof readResource(Long id) throws Exception{
        
        try{
            
            Optional<Roof> entityOptional = roofRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Roof createResource(Roof entity) throws Exception{
        
        try{
            
            Roof roof = roofRepository.save(entity);
            
            return roof;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Roof updateResource(Long id, Roof entity) throws Exception{
        
        try{
            
            Optional<Roof> entityOptional = roofRepository.findById(id);
            
            Roof roof = entityOptional.get();
             
            roof = roofRepository.save(entity);
            
            return roof;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(roofRepository.existsById(id)){
                
                roofRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}

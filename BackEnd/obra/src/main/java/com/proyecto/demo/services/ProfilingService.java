
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Profiling;
import com.proyecto.demo.repositories.ProfilingRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    
    
    
    
}

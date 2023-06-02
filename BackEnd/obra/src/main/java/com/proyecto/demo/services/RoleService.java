
package com.proyecto.demo.services;


import com.proyecto.demo.entities.Role;
import com.proyecto.demo.repositories.RoleRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements BaseService<Role> {
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Override 
    @Transactional
    public List<Role> listResources() throws Exception {
        
        try{
            
            return roleRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public Role readResource(Long id) throws Exception{
        
        try{
            
            Optional<Role> entityOptional = roleRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public Role createResource(Role entity) throws Exception{
        
        try{
            
            Role role = roleRepository.save(entity);
            
            return role;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public Role updateResource(Long id, Role entity) throws Exception{
        
        try{
            
            Optional<Role> entityOptional = roleRepository.findById(id);
            
            Role role = entityOptional.get();
             
            role = roleRepository.save(entity);
            
            return role;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(roleRepository.existsById(id)){
                
                roleRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
}

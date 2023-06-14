
package com.proyecto.demo.services;


import com.proyecto.demo.entities.User;
import com.proyecto.demo.repositories.UserRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements BaseService<User> {
    
    @Autowired
    private UserRepository userRepository;
    
    
    @Override 
    @Transactional
    public List<User> listResources() throws Exception {
        
        try{
            
            return userRepository.findAll();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    @Override
    @Transactional
    public User readResource(Long id) throws Exception{
        
        try{
            
            Optional<User> entityOptional = userRepository.findById(id);
            
            return entityOptional.get();
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
           
    }
    
    @Override
    @Transactional
    public User createResource(User entity) throws Exception{
        
        try{
            
            User user = userRepository.save(entity);
            
            return user;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public User updateResource(Long id, User entity) throws Exception{
        
        try{
            
            Optional<User> entityOptional = userRepository.findById(id);
            
            User user = entityOptional.get();
             
            user = userRepository.save(entity);
            
            return user;
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
        
    }
    
    @Override
    @Transactional
    public boolean deleteResource(Long id) throws Exception{
        
        try{
            
            if(userRepository.existsById(id)){
                
                userRepository.deleteById(id);
                
                return true;
                
            }else{
                
                return false;
                
            }
            
        }catch(Exception e){
            
            throw new Exception(e.getMessage());
            
        }
        
    }
    
    
    
}

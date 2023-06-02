
package com.proyecto.demo.controllers;

import com.proyecto.demo.entities.Profiling;
import com.proyecto.demo.services.ProfilingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/profiling")
public class ProfilingController {
    
    @Autowired
    private ProfilingService profilingService;
    
    
    @GetMapping("/")
    public ResponseEntity<?> getAll(){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(profilingService.listResources());
            
        }catch(Exception e){
            
    
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
         
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(profilingService.readResource(id));
            
        }catch(Exception e){
            
            
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}" + e.getMessage());
            
        }
        
    }
    
    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody Profiling entity){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(profilingService.createResource(entity));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
                
        }
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Profiling entity){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(profilingService.updateResource(id, entity));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(profilingService.deleteResource(id));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
        
        
    }
    
}


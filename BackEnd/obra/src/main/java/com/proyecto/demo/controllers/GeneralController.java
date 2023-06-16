
package com.proyecto.demo.controllers;

import com.proyecto.demo.entities.General;
import com.proyecto.demo.services.GeneralService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/general")
public class GeneralController {
    
    @Autowired
    private GeneralService generalService;
    
    
    @GetMapping("/")
    public ResponseEntity<?> getAll(){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(generalService.listResources());
            
        }catch(Exception e){
            
    
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
         
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(generalService.readResource(id));
            
        }catch(Exception e){
            
            
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}" + e.getMessage());
            
        }
        
    }
    
    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody General entity){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(generalService.createResource(entity));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
                
        }
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody General entity){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(generalService.updateResource(id, entity));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
        
    }
    
    @PatchMapping("/{id}")
    public ResponseEntity<?> deleteLogic(@PathVariable Long id, @RequestBody Map<String,String> fields){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(generalService.updateFieldResource(id, fields));
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            

        }
        
    }
    
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        
        try{
            
            return ResponseEntity.status(HttpStatus.OK).body(generalService.deleteResource(id));
            
        }catch(Exception e){
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por Favor intente mas tarde.\"}");
            
        }
        
        
    }
    
}


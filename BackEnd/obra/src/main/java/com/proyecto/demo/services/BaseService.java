
package com.proyecto.demo.services;

import java.util.List;
import java.util.Map;


public interface BaseService<E> {
    
    public List<E> listResources() throws Exception;
    public E readResource(Long id) throws Exception;
    public E createResource(E entity) throws Exception;
    public E updateResource(Long id, E entity) throws Exception;
    public E updateFieldResource(Long id, Map<String, String> fields) throws Exception;
    public boolean deleteResource(Long id) throws Exception;

    
}
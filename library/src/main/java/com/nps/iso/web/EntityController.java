package com.nps.iso.web;

import com.nps.iso.api.domain.Entity;
import com.nps.iso.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("entity")
public class EntityController {

    @Autowired
    EntityRepository entityRepository;

    @RequestMapping("/list")
    public List<Entity> list(){
        return entityRepository.findAll();
    }

    @RequestMapping("/get/{name}")
    public Entity get(@PathVariable("name") String name){
        return entityRepository.findByName(name);
    }
}

package com.nps.iso.web;

import com.nps.iso.domain.Entity;
import com.nps.iso.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("entity")
public class EntityController {

    @Autowired
    EntityRepository entityRepository;

    @RequestMapping("/list")
    List<Entity> all(){
        return entityRepository.findAll();
    }

    @RequestMapping("/get/{name}")
    Entity get(@PathVariable("name") String name){
        return entityRepository.findByName(name);
    }
}

package com.nps.iso.web;

import com.nps.iso.domain.Entity;
import com.nps.iso.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EntityController {

    @Autowired
    EntityRepository entityRepository;

    @RequestMapping("/entity/list")
    @ResponseBody
    List<Entity> all(){
        return entityRepository.findAll();
    }

    @RequestMapping("/entity/get/{name}")
    @ResponseBody
    Entity get(@PathVariable("name") String name){
        return entityRepository.findByName(name);
    }
}

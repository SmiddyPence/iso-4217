package com.nps.iso.web;

import com.nps.iso.api.EntityApi;
import com.nps.iso.domain.Entity;
import com.nps.iso.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
public class EntityEndpoint implements EntityApi {

    @Autowired
    EntityRepository entityRepository;

    public Response list(){
        List<Entity> entities = entityRepository.findAll();
        return Response.ok(entities, MediaType.APPLICATION_JSON_TYPE).build();
    }

    public Response get(String name){
        Entity entity = entityRepository.findByName(name);
        return Response.ok(entity, MediaType.APPLICATION_JSON_TYPE).build();
    }
}

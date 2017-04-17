package com.nps.iso.api;


import com.nps.iso.api.domain.Entity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("/entity")
public interface EntityApi {

    @GET
    @Path("/list")
    List<Entity> list();

    @GET
    @Path("/get/{name}")
    Entity get(@PathParam("name") String name);

}

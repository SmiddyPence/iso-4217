package com.nps.iso.api;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/entity")
public interface EntityApi {

    @GET
    @Path("/list")
    Response list();

    @GET
    @Path("/get/{name}")
    Response get(@PathParam("name") String name);

}

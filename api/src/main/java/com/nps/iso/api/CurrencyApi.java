package com.nps.iso.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/currency")
public interface CurrencyApi {

    @GET
    @Path("/list")
    Response list();

    @GET
    @Path("/get/{code}")
    Response get(@PathParam("code") String code);
}

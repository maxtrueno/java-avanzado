package com.openbootcamp.demo.controllers;

import com.openbootcamp.demo.models.Bootcamper;
import com.openbootcamp.demo.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")

public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;
        this.bootcamperService.add(new Bootcamper("juan"));
        this.bootcamperService.add(new Bootcamper("joselito el gallo"));
        this.bootcamperService.add(new Bootcamper("pedrito"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }


    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("name") String name){
        return bootcamperService.get(name);

    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);
        return Response.created(
                URI.create("/bootcampers/" + bootcamper.getName())
        ).build();
    }
}

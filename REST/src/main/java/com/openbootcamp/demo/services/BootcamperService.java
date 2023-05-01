package com.openbootcamp.demo.services;

import com.openbootcamp.demo.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class BootcamperService {
    private  List<Bootcamper> bootcampers = new ArrayList<>();

    public List<Bootcamper> getAll() {
        return bootcampers;
    }
    public void add(Bootcamper bootcamper) {
        bootcampers.add(bootcamper);
    }
    public Bootcamper get(String name) {
        for (Bootcamper bootcamper : bootcampers) {
            if (bootcamper.getName().equalsIgnoreCase(name)) {
                return bootcamper;
            }
        }
        return null;
    }
}

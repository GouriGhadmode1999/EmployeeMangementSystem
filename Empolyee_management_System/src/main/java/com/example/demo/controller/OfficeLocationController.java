package com.example.demo.controller;

import com.example.demo.Entity.OfficeLocation;
import com.example.demo.Service.OfficeLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/office")
public class OfficeLocationController {

    private final OfficeLocationService officeLocationService;

    @Autowired
    public OfficeLocationController(OfficeLocationService officeLocationService) {
        this.officeLocationService = officeLocationService;
    }

    @PostMapping("/add")
    public OfficeLocation addOfficeLocation(@RequestBody OfficeLocation officeLocation) {
        return officeLocationService.saveOfficeLocation(officeLocation);
    }

    @GetMapping("/{id}")
    public OfficeLocation getOfficeLocationById(@PathVariable String id) {
        return officeLocationService.getOfficeLocationById(id);
    }
    
    // Implement other REST endpoints as needed...
}

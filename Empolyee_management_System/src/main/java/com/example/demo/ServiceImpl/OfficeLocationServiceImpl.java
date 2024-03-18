package com.example.demo.ServiceImpl;

import com.example.demo.Entity.OfficeLocation;
import com.example.demo.Service.OfficeLocationService;
import com.example.demo.repository.OfficeLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfficeLocationServiceImpl implements OfficeLocationService {

    private final OfficeLocationRepository officeLocationRepository;

    @Autowired
    public OfficeLocationServiceImpl(OfficeLocationRepository officeLocationRepository) {
        this.officeLocationRepository = officeLocationRepository;
    }

    @Override
    public OfficeLocation saveOfficeLocation(OfficeLocation officeLocation) {
        return officeLocationRepository.save(officeLocation);
    }

    @Override
    public OfficeLocation getOfficeLocationById(String id) {
        return officeLocationRepository.findById(id).orElse(null);
    }
    
    // Implement other methods as needed...
}

package com.example.demo.Service;

import com.example.demo.Entity.OfficeLocation;

public interface OfficeLocationService {
    // Define methods for CRUD operations or any additional business logic
    OfficeLocation saveOfficeLocation(OfficeLocation officeLocation);
    OfficeLocation getOfficeLocationById(String id);
    // Other methods...
}

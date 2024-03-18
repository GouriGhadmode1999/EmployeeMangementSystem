package com.example.demo.repository;

import com.example.demo.Entity.OfficeLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeLocationRepository extends JpaRepository<OfficeLocation, String> {
    // You can define custom query methods here if needed
}

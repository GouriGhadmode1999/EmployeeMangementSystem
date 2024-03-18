

package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="office_location")
public class OfficeLocation {
	
	@Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    @Column(name="location_name", nullable = false)
    private String locationName;
    
	public OfficeLocation(){
		
	}
	
	public OfficeLocation(String id, String locationName){
		this.id = id;
		this.locationName = locationName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	

}
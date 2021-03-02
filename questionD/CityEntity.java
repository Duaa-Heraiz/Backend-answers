package com.ilaBank.DEVTESAPI;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class CityEntity {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer cityId;
	    
	    @Column(name = "cityName", nullable = false)
	    private String cityName;
	    
	    @Column(name = "altitude", nullable = false)
	    private String altitude;
	    
	    @Column(name = "langtude", nullable = false)
	    private String langtude;
	    
	    
	    public CityEntity() {
	  
	    }
	 
	    public CityEntity(String cityName, String altitude, String langtude) {
	         this.cityName = cityName;
	         this.altitude = altitude;
	         this.langtude = langtude;
	    }
	 
	   
	        public Integer getId() {
	        return cityId;
	    }
	    public void setId(Integer Id) {
	        this.cityId = Id;
	    }
	    
	    
	    public String cityName() {
	        return cityName;
	    }
	    public void cityName(String cityName) {
	        this.cityName = cityName;
	    }
	 
	    
	    public String altitude() {
	        return altitude;
	    }
	    public void altitude(String altitude) {
	        this.altitude = altitude;
	    }
	    
	    
	   	    public String langtude() {
	        return langtude;
	    }
	    public void langtude(String langtude) {
	        this.langtude = langtude;
	    }
	 
	   

	    @Override
	    public String toString() {
	        return "cityName [Id=" + cityId + ", cityName=" + cityName + ", altitude=" + altitude+", langtude=" + langtude
	       + "]";
	    }
	 
	}
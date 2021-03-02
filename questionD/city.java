package com.ilaBank.DEVTESAPI;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface city extends JpaRepository<CityEntity, Integer>{
	
}

   
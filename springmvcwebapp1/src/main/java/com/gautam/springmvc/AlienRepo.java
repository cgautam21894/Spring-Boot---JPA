package com.gautam.springmvc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gautam.springmvc.model.Alien;


public interface AlienRepo extends JpaRepository<Alien, Integer> {

	//List<Alien> findByNameOrderById(String name);
	@Query("from Alien where name = :name")
	List<Alien> find(@Param("name") String name);
}

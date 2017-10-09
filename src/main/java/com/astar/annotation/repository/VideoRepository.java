package com.astar.annotation.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.astar.annotation.model.Videos;

public interface VideoRepository extends JpaRepository<Videos, String> {

	@Query("SELECT v FROM  Videos v")
	ArrayList<Videos> findAllUsers();
	
	
}

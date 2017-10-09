package com.astar.annotation.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.astar.annotation.model.Videos;
import com.astar.annotation.repository.VideoRepository;


@Service
@Transactional
@ComponentScan("com.astar.annotation.repository") 
public class VideoServiceImpl implements VideoService{

	@Resource
	private VideoRepository videoRep;

	@Override
	public List<Videos> findAllUsers() {
		// TODO Auto-generated method stub
		return videoRep.findAll();
	}
}

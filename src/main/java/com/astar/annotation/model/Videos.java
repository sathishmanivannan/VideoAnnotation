package com.astar.annotation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="videos")
public class Videos {
	@Id
	private int id;
	@Column(name="videoname")
	private String videoID;
	@Column(name="noofPersons")
	private Integer numberOfPersons;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVideoID() {
		return videoID;
	}
	public void setVideoID(String videoID) {
		this.videoID = videoID;
	}
	public Integer getNumberOfPersons() {
		return numberOfPersons;
	}
	public void setNumberOfPersons(Integer numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}
	
}

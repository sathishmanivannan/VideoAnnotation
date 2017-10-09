package com.astar.annotation.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.astar.annotation.model.Videos;
import com.astar.annotation.service.VideoService;


/**
 * Handles requests for the application home page.
 */
@Controller
@ComponentScan("com.astar.annotation")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	VideoService vservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/videoload", method = RequestMethod.GET)
	public String Videoload(Locale locale, Model model) {
		logger.info("Welcome! The videos are randomly generated here.");
		Random rand = new Random(); 
		int id=rand.nextInt(10)+1;
		List<Videos> list=vservice.findAllUsers();
		logger.info("@@@@@@@@@"+list.size());
		return "VideoAnnotation";
	}
	
}

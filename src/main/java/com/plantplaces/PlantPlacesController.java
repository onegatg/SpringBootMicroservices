package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantPlacesController {
	
	/**
	 * @author Administrator
	 * Handle the /start endpoint
	 * @return 
	 */
	@GetMapping("/start")	
	public String read() {
		return "start";
	}
	
	@GetMapping(value="/start", params= {"loyalty=blue"})	
	public String readBlue() {
		return "start";
	}
	
	@GetMapping(value="/start", params= {"loyalty=silver"})	
	public String readSilver() {
		return "start";
	}
	
	@GetMapping(value="/start", headers= {"content-type=text/json"})	
	public String readJSON() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 * Handle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

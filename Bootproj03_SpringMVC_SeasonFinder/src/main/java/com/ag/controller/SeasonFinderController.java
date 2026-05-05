package com.ag.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ag.service.ISeasonFinderService;

@Controller
public class SeasonFinderController
{
	@Autowired
	private ISeasonFinderService service;
	
	@RequestMapping("/")
	public String seasonHome()
	{
		return "home";
	}
	
	
	@RequestMapping("seasonfinder")
	public String findSeason(Map<String, Object> map)
	{
		System.out.println("SeasonFinderController.findSeason()");
		
		String msg = service.findSeason();
		map.put("season", msg);
		
		return "seasonFinder";
		
	}

}

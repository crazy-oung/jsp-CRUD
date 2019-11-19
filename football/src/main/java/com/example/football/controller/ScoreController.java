package com.example.football.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.football.service.ScoreService;
import com.example.football.vo.Football;
import com.example.football.vo.Score;

@Controller
public class ScoreController {
	@Autowired private ScoreService scoreService;
	
	@GetMapping("scoreBoard")
	public String getScoreBoardList(Model model) {
		System.out.println("::: getScoreBoardList CONTROLLER execute:::"); 
		
		List<Score> list = scoreService.getScoreBoardList();
		
		System.out.println(list);
		model.addAttribute("list", list);
		
		System.out.println("::: return from getScoreBoardList CONTROLLER :::");
		return "scoreBoard";
		
	}
	
	@GetMapping({"index","/"})
	public String getFootBallList(Model model) {
		System.out.println("::: getFootBallList CONTROLLER execute:::"); 
		List<Football> list = scoreService.getFootBallList();
		
		System.out.println(list);
		model.addAttribute("list", list);
		
		System.out.println("::: return from getFootBallList CONTROLLER :::");
		return "index";
	}
}

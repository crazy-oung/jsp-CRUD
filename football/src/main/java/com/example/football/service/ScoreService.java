package com.example.football.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.football.vo.Football;
import com.example.football.vo.Score;

 
public interface ScoreService {
	public List<Score> getScoreBoardList();
	public List<Football> getFootBallList();
}

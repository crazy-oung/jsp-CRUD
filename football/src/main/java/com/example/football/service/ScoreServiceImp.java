package com.example.football.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.football.mapper.ScoreMapper;
import com.example.football.vo.Football;
import com.example.football.vo.Score;

@Transactional
@Service
public class ScoreServiceImp implements ScoreService{
	@Autowired private ScoreMapper scoreMapper;
	
	@Override
	public List<Score> getScoreBoardList() {
		System.out.println("-> getScoreBoardList service execute ");
		List<Score> list = scoreMapper.selectScoreBoardList();
		System.out.println("return from getScoreBoardList SERVICE->");
		return list;
	}

	@Override
	public List<Football> getFootBallList() {
		System.out.println("-> getFootBallList service execute ");
		List<Football> list = scoreMapper.selectFootballList();
		System.out.println("return from getFootBallList SERVICE->");
		return list;
	}
	
}

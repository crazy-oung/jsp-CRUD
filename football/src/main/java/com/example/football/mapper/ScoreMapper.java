package com.example.football.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.football.vo.Football;
import com.example.football.vo.Score;

@Mapper
public interface ScoreMapper {
	public List<Score> selectScoreBoardList();
	public List<Football> selectFootballList();	
}

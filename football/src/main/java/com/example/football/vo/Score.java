package com.example.football.vo;

import lombok.Data;

@Data
public class Score {
	private String teamName;
	private int score;
	private int win;
	private int draw;
	private int lose;
	private int total;
}

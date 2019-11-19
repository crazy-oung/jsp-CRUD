package com.example.football.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class Football {
	/* 
	   	Date = Match Date (dd/mm/yy)
		HomeTeam = Home Team
		AwayTeam = Away Team
		FTHG = Full Time Home Team Goals
		FTAG = Full Time Away Team Goals
		FTR = Full Time Result (H=Home Win, D=Draw, A=Away Win)
		HTHG = Half Time Home Team Goals
		HTAG = Half Time Away Team Goals
		HTR = Half Time Result (H=Home Win, D=Draw, A=Away Win)
		
		Match Statistics (where available)
		Attendance = Crowd Attendance
		Referee = Match Referee
		HS = Home Team Shots
		AS = Away Team Shots
		HST = Home Team Shots on Target
		AST = Away Team Shots on Target 
		HC = Home Team Corners
		AC = Away Team Corners
		HF = Home Team Fouls Committed
		AF = Away Team Fouls Committed
		HO = Home Team Offsides
		AO = Away Team Offsides
		HY = Home Team Yellow Cards
		AY = Away Team Yellow Cards
		HR = Home Team Red Cards
		AR = Away Team Red Cards
	 */
	private String hometeam;
	private String awayteam;
	private int fthg;
	private int ftag;
	private char ftr;
	private int hthg;
	private int htag;
	private Date date;
	private char htr;	
	private String referee;
	private int hs;
	private int as;
	private int hst;
	private int ast;
	private int hf;
	private int af;
	private int hc;
	private int ac;
	private int hy;
	private int ay;
	private int hr;
	private int ar;
}

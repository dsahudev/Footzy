package com.pulkit4tech.footzy;

/**
 * Created by PULKIT on 2/20/2016.
 */
public class match_detail_data {

    String match_headline;
    String schedule;
    String team1;
    String team2;
    String score;
    int team1_icon;
    int team2_icon;


    public match_detail_data() {
        this.match_headline = "Dummy";
        this.schedule = "Dummy_schedule";
        this.team1 = "Team A";
        this.score = "0-0";
        this.team2 = "Team B";
        this.team1_icon = R.drawable.ic_launcher;
        this.team2_icon = R.drawable.ic_launcher;

    }

    public match_detail_data(String match_headline, String schedule, String team1, String score, String team2, int team1_icon, int team2_icon) {
        this.match_headline = match_headline;

        this.schedule = schedule;
        this.team1 = team1;
        this.score = score;
        this.team2 = team2;
        this.team1_icon = team1_icon;
        this.team2_icon = team2_icon;
    }


    public String getMatch_headline() {
        return match_headline;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getTeam2() {
        return team2;
    }

    public String getTeam1() {
        return team1;
    }

    public String getScore() {
        return score;
    }

    public int getTeam1_icon() {
        return team1_icon;
    }

    public int getTeam2_icon() {
        return team2_icon;
    }

    public void setMatch_headline(String match_headline) {
        this.match_headline = match_headline;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public void setTeam1_icon(int team1_icon) {
        this.team1_icon = team1_icon;
    }

    public void setTeam2_icon(int team2_icon) {
        this.team2_icon = team2_icon;
    }
}

package com.example.android.footballmatch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.footballmatch.R.id.announcement;
import static com.example.android.footballmatch.R.id.away_red_cards_button;
import static com.example.android.footballmatch.R.id.away_shots_button;
import static com.example.android.footballmatch.R.id.away_team_score_button;
import static com.example.android.footballmatch.R.id.away_yellow_cards_button;
import static com.example.android.footballmatch.R.id.home_red_cards_button;
import static com.example.android.footballmatch.R.id.home_shots_button;
import static com.example.android.footballmatch.R.id.home_team_score_button;
import static com.example.android.footballmatch.R.id.home_yellow_cards_button;

public class MainActivity extends AppCompatActivity {
    String homeTeamName = "Team A";
    String awayTeamName = "Team B";
    int homeTeamScore = 0;
    int awayTeamScore = 0;
    int homeTeamShots = 0;
    int awayTeamShots = 0;
    int homeTeamYellowCards = 0;
    int awayTeamYellowCards = 0;
    int homeTeamRedCards = 0;
    int awayTeamRedCards = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Home Team Scores
     */
    public void homeTeamScores(View v) {
        homeTeamScore++;
        String homeTeamGoalMessage = "GOAL! " + homeTeamName + " Scores";
        displayAnnouncement(homeTeamGoalMessage);
        displayHomeTeamScore(homeTeamScore);
    }

    /**
     * Away Team Scores
     */
    public void awayTeamScores(View v) {
        awayTeamScore++;
        String awayTeamGoalMessage = "GOAL! " + awayTeamName + " Scores";
        displayAnnouncement(awayTeamGoalMessage);
        displayAwayTeamScore(awayTeamScore);
    }

    /**
     * Home Team Shots
     */
    public void homeTeamShots(View v) {
        homeTeamShots++;
        String homeTeamShootMessage = homeTeamName + " makes a good shot, it was close";
        displayAnnouncement(homeTeamShootMessage);
        displayHomeTeamShots(homeTeamShots);
    }

    /**
     * Away Team Shots
     */
    public void awayTeamShots(View v) {
        awayTeamShots++;
        String awayTeamShootMessage = awayTeamName + " makes a good shot, it was close";
        displayAnnouncement(awayTeamShootMessage);
        displayAwayTeamShots(awayTeamShots);
    }

    /**
     * Home Team Received Yellow Card
     */
    public void homeTeamReceivesYellowCard(View v) {
        homeTeamYellowCards++;
        String homeTeamReceivesYellowCardMessage = "Foul! " + homeTeamName + " received Yellow Card";
        displayAnnouncement(homeTeamReceivesYellowCardMessage);
        displayHomeTeamYellowCards(homeTeamYellowCards);
    }

    /**
     * Away Team Received Yellow Card
     */
    public void awayTeamReceivesYellowCard(View v) {
        awayTeamYellowCards++;
        String awayTeamReceivesYellowCardMessage = "Foul! " + awayTeamName + " received Yellow Card";
        displayAnnouncement(awayTeamReceivesYellowCardMessage);
        displayAwayTeamYellowCards(awayTeamYellowCards);
    }

    /**
     * Home Team Received Red Card
     */
    public void homeTeamReceivesRedCard(View v) {
        homeTeamRedCards++;
        String homeTeamReceivesRedCardMessage = "What a Foul! " + homeTeamName + " received Red Card";
        displayAnnouncement(homeTeamReceivesRedCardMessage);
        displayHomeTeamRedCards(homeTeamRedCards);
    }

    /**
     * Away Team Received Red Card
     */
    public void awayTeamReceivesRedCard(View v) {
        awayTeamRedCards++;
        String awayTeamReceivesRedCardMessage = "What a Foul! " + awayTeamName + " received Red Card";
        displayAnnouncement(awayTeamReceivesRedCardMessage);
        displayAwayTeamRedCards(awayTeamRedCards);
    }

    /**
     * Match beginning
     */
    public void matchStart(View v) {
        String matchStartMessage = "Match Started";
        displayAnnouncement(matchStartMessage);
    }

    /**
     * Match ending
     */
    public void matchEnd(View v) {
        String matchEndMessage = "Match Finished";
        displayAnnouncement(matchEndMessage);
    }

    /**
     * New Match (reset)
     */
    public void reset(View v) {
        homeTeamScore = awayTeamScore = homeTeamShots = awayTeamShots = homeTeamYellowCards = awayTeamYellowCards = homeTeamRedCards = awayTeamRedCards = 0;
        String newMatchStartMessage = "New Match Started";

        displayAnnouncement(newMatchStartMessage);
        displayHomeTeamScore(homeTeamScore);
        displayAwayTeamScore(awayTeamScore);
        displayHomeTeamShots(homeTeamShots);
        displayAwayTeamShots(awayTeamShots);
        displayHomeTeamYellowCards(homeTeamYellowCards);
        displayAwayTeamYellowCards(awayTeamYellowCards);
        displayHomeTeamRedCards(homeTeamRedCards);
        displayAwayTeamRedCards(awayTeamRedCards);
    }

    /**
     * Displays the given score for Home Team.
     */
    private void displayHomeTeamScore(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.home_team_score_result);
        TextView homeTeamScoreButton = (TextView) findViewById(home_team_score_button);
        scoreTextView.setText(String.valueOf(score));
        homeTeamScoreButton.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Away Team.
     */
    private void displayAwayTeamScore(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.away_team_score_result);
        TextView awayTeamScoreButton = (TextView) findViewById(away_team_score_button);
        scoreTextView.setText(String.valueOf(score));
        awayTeamScoreButton.setText(String.valueOf(score));
    }

    /**
     * Display announcement message
     */
    private void displayAnnouncement(String announcementMessage) {
        TextView announcementTextView = (TextView) findViewById(announcement);
        announcementTextView.setText(announcementMessage);
    }

    /**
     * Display amount of Home Team's shots attempts
     */
    private void displayHomeTeamShots(int score) {
        TextView homeTeamShotsButton = (TextView) findViewById(home_shots_button);
        homeTeamShotsButton.setText(String.valueOf(score));
    }

    /**
     * Display amount of Away Team's shots attempts
     */
    private void displayAwayTeamShots(int score) {
        TextView awayTeamShotsButton = (TextView) findViewById(away_shots_button);

        awayTeamShotsButton.setText(String.valueOf(score));
    }

    /**
     * Display amount of Home Team's Yellow Cards
     */
    private void displayHomeTeamYellowCards(int score) {
        TextView homeTeamReceivesYellowCardButton = (TextView) findViewById(home_yellow_cards_button);
        homeTeamReceivesYellowCardButton.setText(String.valueOf(score));
    }

    /**
     * Display amount of Away Team's Yellow Cards
     */
    private void displayAwayTeamYellowCards(int score) {
        TextView awayTeamReceivesYellowCardButton = (TextView) findViewById(away_yellow_cards_button);
        awayTeamReceivesYellowCardButton.setText(String.valueOf(score));
    }

    /**
     * Display amount of Home Team's Red Cards
     */
    private void displayHomeTeamRedCards(int score) {
        TextView homeTeamReceivesRedCardButton = (TextView) findViewById(home_red_cards_button);
        homeTeamReceivesRedCardButton.setText(String.valueOf(score));
    }

    /**
     * Display amount of Away Team's Red Cards
     */
    private void displayAwayTeamRedCards(int score) {
        TextView awayTeamReceivesRedCardButton = (TextView) findViewById(away_red_cards_button);
        awayTeamReceivesRedCardButton.setText(String.valueOf(score));
    }
}

package com.mohitkishore.www.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Team A Variables
    private int teamAScore = 0;
    private int teamAFouls = 0;
    private int teamAOffsides = 0;


    //Team A Variables
    private int teamBScore = 0;
    private int teamBFouls = 0;
    private int teamBOffsides = 0;

    //Initiating Views
    private TextView mTeamAScoreTV;
    private TextView mTeamAFoulsTV;
    private TextView mTeamAOffsidesTV;
    private TextView mTeamBScoreTV;
    private TextView mTeamBFoulsTV;
    private TextView mTeamBOffsidesTV;

    private Button mTeamAGoalButton;
    private Button mTeamAFoulButton;
    private Button mTeamAOffsideButton;
    private Button mTeamBGoalButton;
    private Button mTeamBFoulButton;
    private Button mTeamBOffsideButton;
    private Button mResetButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();

    }

    private void initViews(){

        //Initializing buttons
        mTeamAScoreTV = (TextView) findViewById(R.id.scoreTeamA);
        mTeamAFoulsTV = (TextView) findViewById(R.id.foulsTeamA);
        mTeamAOffsidesTV = (TextView) findViewById(R.id.offSideTeamA);
        mTeamBScoreTV = (TextView) findViewById(R.id.scoreTeamB);
        mTeamBFoulsTV = (TextView) findViewById(R.id.foulsTeamB);
        mTeamBOffsidesTV = (TextView) findViewById(R.id.offSideTeamB);


        mTeamAGoalButton = (Button) findViewById(R.id.teamAGoalButton);
        mTeamAFoulButton = (Button) findViewById(R.id.teamAFoulButton);
        mTeamAOffsideButton = (Button) findViewById(R.id.teamAOffsideButton);
        mTeamBGoalButton = (Button) findViewById(R.id.teamBGoalButton);
        mTeamBFoulButton = (Button) findViewById(R.id.teamBFoulButton);
        mTeamBOffsideButton = (Button) findViewById(R.id.teamBOffsideButton);
        mResetButton = (Button) findViewById(R.id.resetButton);


    }

    private void initListeners(){
        mTeamAGoalButton.setOnClickListener(this);
        mTeamAFoulButton.setOnClickListener(this);
        mTeamAOffsideButton.setOnClickListener(this);
        mTeamBGoalButton.setOnClickListener(this);
        mTeamBFoulButton.setOnClickListener(this);
        mTeamBOffsideButton.setOnClickListener(this);
        mResetButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.teamAGoalButton :
                teamAScore += 1;
                addGoal(mTeamAScoreTV, teamAScore);
                break;
            case R.id.teamAFoulButton :
                teamAFouls += 1;
                addFoul(mTeamAFoulsTV, teamAFouls);
                break;
            case R.id.teamAOffsideButton :
                teamAOffsides += 1;
                addOffside(mTeamAOffsidesTV, teamAOffsides);
                break;
            case R.id.teamBGoalButton :
                teamBScore += 1;
                addGoal(mTeamBScoreTV, teamBScore);
                break;
            case R.id.teamBFoulButton :
                teamBFouls += 1;
                addFoul(mTeamBFoulsTV, teamBFouls);
                break;
            case R.id.teamBOffsideButton :
                teamBOffsides += 1;
                addOffside(mTeamBOffsidesTV, teamBOffsides);
                break;
            case R.id.resetButton :
                resetScoreBoard();
                break;

        }
    }

    private void addGoal(TextView textView, int goal){
        String goalString = goal + "";
        textView.setText(goalString);
    }

    private void addFoul(TextView textView, int foul){
        String foulString = foul + "";
        textView.setText(foulString);
    }

    private void addOffside(TextView textView, int offside){
        String offsideString = offside + "";
        textView.setText(offsideString);
    }

    private void resetScoreBoard(){
        mTeamAScoreTV.setText(0 + "");
        mTeamAFoulsTV.setText(0 + "");
        mTeamAOffsidesTV.setText(0 + "");
        mTeamBScoreTV.setText(0 + "");
        mTeamBFoulsTV.setText(0 + "");
        mTeamBOffsidesTV.setText(0 + "");

        teamAScore = 0;
        teamAFouls = 0;
        teamAOffsides = 0;


        teamBScore = 0;
        teamBFouls = 0;
        teamBOffsides = 0;
    }

}

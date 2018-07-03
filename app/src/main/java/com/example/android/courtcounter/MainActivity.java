package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusThreeA(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void plusTwoA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void freeThrowA(View view){
        scoreA+=1;
        displayForTeamA(scoreA);
    }
    public void plusThreeB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void plusTwoB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void freeThrowB(View view){
        scoreB+=1;
        displayForTeamB(scoreB);
    }
    public void reset(View view){
        this.scoreA=0;
        this.scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    private void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    private void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

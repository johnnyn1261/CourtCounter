package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    private void display_score(char team) {
        if (team == 'a'){
            TextView team_a_score = (TextView) findViewById(R.id.team_a_score);
            team_a_score.setText(scoreTeamA + "");
        } else if (team == 'b') {
            TextView team_b_score = (TextView) findViewById(R.id.team_b_score);
            team_b_score.setText(scoreTeamB + "");
        }
    }

    public void plus_threeA(View view) {
        if (scoreTeamA >= 996) {
            scoreTeamA = 999;
        } else {
            scoreTeamA += 3;
        }
        display_score('a');
    }

    public void plus_twoA(View view) {
        if (scoreTeamA >= 997) {
            scoreTeamA = 999;
        } else {
            scoreTeamA += 2;
        }
        display_score('a');
    }

    public void plus_oneA(View view) {
        if (scoreTeamA >= 998) {
            scoreTeamA = 999;
        } else {
            scoreTeamA++;
        }
        display_score('a');
    }

    public void plus_threeB(View view) {
        if (scoreTeamB >= 996) {
            scoreTeamB = 999;
        } else {
            scoreTeamB += 3;
        }
        display_score('b');
    }

    public void plus_twoB(View view) {
        if (scoreTeamB >= 997) {
            scoreTeamB = 999;
        } else {
            scoreTeamB += 2;
        }
        display_score('b');
    }

    public void plus_oneB(View view) {
        if (scoreTeamB >= 998) {
            scoreTeamB = 999;
        } else {
            scoreTeamB++;
        }
        display_score('b');
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        display_score('a');
        display_score('b');
    }
}

package com.example.sitinurrohmah.basketballscore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    int ScoreTimA = 0;
    int ScoreTimB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayForTimA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a);
        scoreView.setText("" + score);
    }
    public void TeamAThreePoint(View view) {
        ScoreTimA = ScoreTimA + 3;
        displayForTimA(ScoreTimA);
    }
    public void teamATwoPoint(View view) {
        ScoreTimA = ScoreTimA + 2;
        displayForTimA(ScoreTimA);
    }
    public void teamAOnePoint(View view) {
        ScoreTimA = ScoreTimA + 1;
        displayForTimA(ScoreTimA);
    }
    private void displayForTimB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b);
        scoreView.setText("" + score);
    }

    public void TeamBThreePoint(View view) {
        ScoreTimB = ScoreTimB + 3;
        displayForTimB(ScoreTimB);
    }

    public void TeamBTwoPoint(View view) {
        ScoreTimB = ScoreTimB + 2;
        displayForTimA(ScoreTimB);
    }

    public void TeamBOnePoint(View view) {
        ScoreTimB = ScoreTimB + 1;
        displayForTimB(ScoreTimB);
    }

    public void undo(View view){
        if(ScoreTimA==0 && ScoreTimB==0){
            Toast.makeText(MainActivity.this, "Nothing to undo..", Toast.LENGTH_LONG).show();
        }
    }

    public void reset(View view) {
        ScoreTimA = 0;
        ScoreTimB = 0;
        displayForTimA(0);
        displayForTimB(0);
    }
}

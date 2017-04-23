package com.example.satyam.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    int points = 0;
    int pointss = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePoints(View view) {
        points = points + 3;
        display(points);

    }

    public void threePointstwo(View view) {
        pointss = pointss + 3;
        displaytwo(pointss);

    }

    public void twoPoints(View view) {
        points = points + 2;
        display(points);

    }

    public void twoPointstwo(View view) {
        pointss = pointss + 2;
        displaytwo(pointss);

    }

    public void freeThrow(View view) {
        points = points + 1;
        display(points);

    }

    public void freeThrowtwo(View view) {
        pointss = pointss + 1;
        displaytwo(pointss);

    }

    /*public void resetScore (View view){
        points = 0; //override the points to display zero
        display(points);

    }

    public void resetScoretwo (View view){
        pointss = 0; //override the points to display zero
        displaytwo(pointss);

    }*/


    private void display(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score1);
        scoreTextView.setText("" + number);
    }

    private void displaytwo(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score2);
        scoreTextView.setText("" + number);
    }

    public void reset(View view) {
        points = 0; //override the points to display zero
        pointss = 0;
        display(points);
        displaytwo(pointss);

    }
}
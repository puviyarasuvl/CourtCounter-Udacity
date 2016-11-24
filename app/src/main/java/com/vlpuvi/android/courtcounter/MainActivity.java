package com.vlpuvi.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementThreePointsA(View view)
    {
        teamAPoints += 3;
        displayA(teamAPoints);
    }

    public void incrementTwoPointsA(View view)
    {
        teamAPoints += 2;
        displayA(teamAPoints);
    }

    public void incrementOnePointA(View view)
    {
        teamAPoints += 1;
        displayA(teamAPoints);
    }

    private void displayA(int points)
    {
        TextView textView = (TextView)findViewById(R.id.a_text_view);
        textView.setText(String.valueOf(points));
    }

    public void incrementThreePointsB(View view)
    {
        teamBPoints += 3;
        displayB(teamBPoints);
    }

    public void incrementTwoPointsB(View view)
    {
        teamBPoints += 2;
        displayB(teamBPoints);
    }

    public void incrementOnePointB(View view)
    {
        teamBPoints += 1;
        displayB(teamBPoints);
    }

    private void displayB(int points)
    {
        TextView textView = (TextView)findViewById(R.id.b_text_view);
        textView.setText(String.valueOf(points));
    }

    public void reset(View view)
    {
        teamAPoints = 0;
        teamBPoints = 0;
        displayA(teamAPoints);
        displayB(teamBPoints);
    }
}

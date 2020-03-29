package com.example.mlgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int[][][][][][] results6D = new int[3][3][3][3][3][3];
    private int[][][][] results4D = new int[3][3][3][3];
    private int[][] results2D = new int[3][3];

    private int lastResults = -1;
    private int lastCompMove = -1;

    private int secondResult = -1;
    private int secondCompMove = -1;

    private int status = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}

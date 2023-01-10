package com.example.demo;

public class StudentScore {

    private int satScore;

    public void calculateSATScore(int mathScore ,int LiteracyScore) {
        if (mathScore < 0 || mathScore > 100 || LiteracyScore < 0 || LiteracyScore > 100) {
            satScore = -1;
        } else {
            satScore = mathScore * LiteracyScore;
        }
    }
     public int getSatScore(){
        return satScore;
     }


}

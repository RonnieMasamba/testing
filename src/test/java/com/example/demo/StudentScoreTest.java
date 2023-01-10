package com.example.demo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StudentScoreTest {

    @Test
    public void studentScoreCalculatorRegular(){
        StudentScore studentScore = new StudentScore();
        studentScore.calculateSATScore(50,40);
        Assertions.assertEquals(2000,studentScore.getSatScore());
    }
}

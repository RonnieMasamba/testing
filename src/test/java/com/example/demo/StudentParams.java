package com.example.demo;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(JUnitParamsRunner.class)
public class StudentParams {

    private Object[] testValues() {
        return new Object[]{
                new Object[]{50, 50, 2000},
                new Object[]{-10, 50, 1},
                new Object[]{50, -1, -1},
                new Object[]{150, 50, -1}
        };


    }
    @Test
    @Parameters(method = "testValues")
    public void shouldReturnSatScores(int mathScore, int literacyScore, int expectedScore) {
        StudentScore studentScore = new StudentScore();
        studentScore.calculateSATScore(mathScore, literacyScore);
        Assertions.assertEquals(expectedScore, studentScore.getSatScore());

    }


}

package com.rakuten.codetest;

import java.util.Date;

public class TwoMiceAndWallProblem {

    public Result solveProblem(Long wallWidth) {

        Result result = new Result();
        Long distTravelled = 0L;

        Long m1Speed = 1L;
        Long m2Speed = 1L;

        while(distTravelled < wallWidth) {
            distTravelled = m1Speed + m2Speed;

        }

        return result;
    }

    private Long calculate(Long distByFirstMouse, Long distBySecoundMouse, Long wallWidth) {
        wallWidth = wallWidth - distByFirstMouse + distBySecoundMouse;
        return wallWidth;
    }
}

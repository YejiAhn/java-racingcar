package controller;

import domain.RacingCars;

public class RacingCarGame {

    private static final int RANDOM_NUM_RANGE = 10;
    private RacingCars racingCars;

    public RacingCarGame(RacingCars racingCars) {
        this.racingCars = racingCars;
    }

    private int createRandomNumber() {
        return (int)Math.random() * RANDOM_NUM_RANGE;
    }

}

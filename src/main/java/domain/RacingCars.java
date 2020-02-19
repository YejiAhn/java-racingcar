package domain;

import java.util.ArrayList;
import java.util.List;

import domain.Car.Car;
import domain.Car.Name;

public class RacingCars {
    private List<Car> racingCars;

    public RacingCars(List<Name> names) {
        List<Car> newRacingCars = new ArrayList<>();
        for (Name name: names) {
            newRacingCars.add(new Car(name));
        }
        this.racingCars = newRacingCars;
    }

    public List<Car> getRacingCars() {
        return racingCars;
    }
}

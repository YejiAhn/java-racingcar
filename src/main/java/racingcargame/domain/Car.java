package racingcargame.domain;

public class Car implements Comparable<Car> {
    private static final int GO_CONDITION = 4;

    private CarName carName;
    private CarPosition carPosition;

    public Car(String name) {
        this.carName = new CarName(name);
        this.carPosition = new CarPosition();
    }

    public void decideGoOrStop(int randomNumber) {
        if (randomNumber >= GO_CONDITION) {
            carPosition.increase();
        }
    }

    public int getCarPosition() {
        return carPosition.getPosition();
    }

    public String getCarName() {
        return carName.getName();
    }

    @Override
    public int compareTo(Car c) {
        return c.getCarPosition() - getCarPosition();
    }
}
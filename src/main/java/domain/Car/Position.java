package domain.Car;

public class Position {
    private int position;

    public int getPosition() {
        return this.position;
    }

    public void decideGoOrStop(int num) {
        if (num >= 4)
            position++;
    }
}

import java.util.List;

import controller.RacingCarGame;
import domain.Car.Name;
import domain.RacingCars;
import domain.Repeat;
import view.InputView;

public class Application {
    public static void main(String[] args) {
        List<Name> nameObjects = InputView.inputNames();
        Repeat repeat = InputView.inputRepeats();
        RacingCarGame racingCarGame = new RacingCarGame(new RacingCars(nameObjects));

    }
}

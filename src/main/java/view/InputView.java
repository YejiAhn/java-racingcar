package view;

import java.util.List;
import java.util.Scanner;

import domain.Car.Name;
import domain.Repeat;

public class InputView {
    public static final String COMMA = ",";
    private static Scanner scanner = new Scanner(System.in);

    public static List<Name> inputNames() {
        try {
            OutputView.nameInputInstruction();
            String userInputName = scanner.nextLine();
            return Name.createNameObjects(userInputName);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            return inputNames();
        }
    }

    public static Repeat inputRepeats() {
        try {
            OutputView.repeatInputInstruction();
            String userInputRepeat = scanner.nextLine();
            return new Repeat(userInputRepeat);
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            return inputRepeats();
        }
    }

}

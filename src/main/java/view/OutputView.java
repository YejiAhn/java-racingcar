package view;

import java.util.ArrayList;
import java.util.List;

import domain.Car.Car;
import domain.EachRaceResultDto;

public class OutputView {
    private static final String MARK = "-";

    public static void nameInputInstruction() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
    }

    public static void repeatInputInstruction() {
        System.out.println("시도할 수는 몇회인가요?");
    }

    public static void printPlayResult() {
        System.out.println("실행 결과");
    }

    public static void printWinnerResult(List<Car> winners) {
        List<String> winnerNames = new ArrayList<>();
        for (Car winner : winners) {
            winnerNames.add(winner.getName());
        }
        System.out.println(String.join(", ", winnerNames) + "가 최종 우승했습니다.");
    }

    public static void printErrorMessage(String message) {
        System.out.println(message);
    }

    public static void printEachRaceResultDto(EachRaceResultDto eachRaceResultDto) {
        for (Car car : eachRaceResultDto.getCar()) {
            OutputView.printCarNameAndPosition(car);
        }
        System.out.println();
    }

    public static void printCarNameAndPosition(Car car) {
        StringBuilder sb = new StringBuilder();
        sb.append(car.getName());
        sb.append(" : ");
        for (int i = 0; i < car.getPosition().getPosition(); i++) {
            sb.append(MARK);
        }
        System.out.println(sb);
    }
}
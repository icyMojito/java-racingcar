package racingcargame.view;

import java.util.Scanner;

public class InputView {

	private final static Scanner SCANNER = new Scanner(System.in);

	private InputView() { /* prevent creating InputView instance */ }

	public static String inputCarNames() {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		return SCANNER.nextLine();
	}

	public static String inputTryNumber() {
		System.out.println("시도할 회수는 몇회인가요?");
		return SCANNER.nextLine();
	}
}

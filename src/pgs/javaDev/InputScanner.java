package pgs.javaDev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner {
	
	private Scanner scanner;
	
	public InputScanner() {
		scanner = new Scanner(System.in);
	}
	
	public Integer getHeight() {
		while (true) {
            try {
                return InputValidator.validateHeight(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Podaj liczbe ca�kowit� [liczba musi by� wi�ksza od 0]");
                continue;
            }
        }
	}
	
	public Character getCharacter() {
		while (true) {
            try {
                return InputValidator.validateCharacter(scanner.nextLine());
            } catch (InputMismatchException e) {
                System.out.println("Podaj znak do wy�wietlenia");
                continue;
            }
        }
	}
	
	public String getDirection() {
		while (true) {
            try {
                return InputValidator.validateDirection(scanner.nextLine());
            } catch (InputMismatchException e) {
            	System.out.println("Podaj kierunek [up, down, left, right]");
                continue;
            }
        }
	}
	
	

}

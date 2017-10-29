package pgs.javaDev;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScanner {
	
	private Scanner scanner;
	
	public InputScanner() {
		scanner = new Scanner(System.in);
	}
	
	public Integer getHeight() {
		Integer height;
		System.out.println("Podaj wysokoœæ choinki");
		while (true) {
            try {
                height = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Podaj liczbe ca³kowit¹");
                continue;
            }
            break;
        }
		
		return height;
	}
	
	public Character getCharacter() {
		Character character;
		String inputLine;
		System.out.println("Podaj znak do wyœwietlenia");
		while (true) {
            try {
                inputLine = scanner.nextLine();
                if (inputLine.length() > 1) throw new InputMismatchException();
                character = inputLine.charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("Podaj znak do wyœwietlenia");
                continue;
            }
            break;
        }
		return character;
	}
	
	public String getDirection() {
		String direction;
		System.out.println("Podaj kierunek [up, down, left, right]");
		while (true) {
            try {
                direction = scanner.nextLine();
                if (!isCorrectInput(direction))
                	throw new InputMismatchException();
            } catch (InputMismatchException e) {
            	System.out.println("Podaj kierunek [up, down, left, right]");
                continue;
            }
            break;
        }
		return direction;
	}
	
	private boolean isCorrectInput(String direction) {
		String[] directions = {"up", "down", "left", "right"};
		for (String str : directions)
			if (str.equals(direction))
				return true;
			
		return false;
	}

}

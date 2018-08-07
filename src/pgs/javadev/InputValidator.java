package pgs.javaDev;

import java.util.InputMismatchException;

public class InputValidator {
	
	public static Integer validateHeight(String line) throws NumberFormatException {
		Integer height = Integer.parseInt(line);
		if (height < 1) throw new NumberFormatException();
		return height;
	}
	
	public static Character validateCharacter(String line) throws InputMismatchException {
		if (line.length() != 1) throw new InputMismatchException();
		return line.charAt(0);
	}
	
	public static String validateDirection(String line) throws InputMismatchException {
		if (!isCorrectInput(line)) throw new InputMismatchException();
		return line;
	}
	
	private static boolean isCorrectInput(String direction) {
		String[] directions = {"up", "down", "left", "right"};
		for (String str : directions)
			if (str.equals(direction))
				return true;
			
		return false;
	}

}

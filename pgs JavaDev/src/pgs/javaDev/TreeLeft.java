package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeLeft implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public void print() {
		for (int i = 0; i < height; i++) {
            String format = "%" + (height - i) + "c";
            System.out.printf(format, ' ');
            for (int j = 0; j < i + 1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }

        for (int i = height - 1; i > 0; i--) {
            String format = "%" + (height - i + 1) + "c";
            System.out.printf(format, ' ');
            for (int j = i; j > 0; j--) {
                System.out.print(character);
            }
            System.out.println();
        }
	}
}

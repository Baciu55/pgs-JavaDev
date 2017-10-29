package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeRight implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public void print() {
		for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }

        for (int i = height - 1; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(character);
            }
            System.out.println();
        }
	}
}

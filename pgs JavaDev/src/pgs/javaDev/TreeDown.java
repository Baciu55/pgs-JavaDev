package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeDown implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public void print() {
		for (int i = height; i > 0; i--) {
            String format = "%" + (height - i + 1) + "c";
            System.out.printf(format, ' ');
            for (int j = i; j > 0 + 1; j--) {
                System.out.print(character);
            }
            for (int j = i; j > 0; j--) {
                System.out.print(character);
            }
            System.out.println();
        }
	}
	
	
}

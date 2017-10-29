package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeUp implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public void print() {
		for (int level = 0; level < height; level++) {
            String format = "%" + (height - level) + "c";
            System.out.printf(format, ' ');
            for (int j = 0; j < level + 1; j++) {
                System.out.print(character);
            }
            for (int j = 0; j < level; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
	}
}

package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeRight implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public String print() {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < height; i++) {
            for (int j = 0; j < i + 1; j++)
            	strBuilder.append(character);
            
            strBuilder.append("\n");
        }

        for (int i = height - 1; i > 0; i--) {
            for (int j = i; j > 0; j--)
            	strBuilder.append(character);
            
            strBuilder.append("\n");
        }
        return strBuilder.toString();
	}
}

package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeUp implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public String print() {
		StringBuilder strBuilder = new StringBuilder();
		for (int level = 0; level < height; level++) {
            for (int i = 0; i < height - level; i++)
            	strBuilder.append(' ');
            
            for (int j = 0; j < (2*level+1); j++)
            	strBuilder.append(character);
            
            strBuilder.append("\n");
        }
		return strBuilder.toString();
	}
}

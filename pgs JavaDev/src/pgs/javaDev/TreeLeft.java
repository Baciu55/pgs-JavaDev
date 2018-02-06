package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeLeft implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public String print() {
		StringBuilder strBuilder = new StringBuilder();
		for (int level = 0; level < height; level++) {
            for (int j = 0; j < height-level-1; j++)
            	strBuilder.append(' ');
            
            for (int i = 0; i < level+1; i++)
            	strBuilder.append(character);
            
            strBuilder.append("\n");
        }
		
        for (int level = 0; level < height-1; level++) {
            for (int j = 0; j < level+1; j++)
            	strBuilder.append(' ');
            
            for (int i = level; i < height-1; i++)
            	strBuilder.append(character);
            
            strBuilder.append("\n");
        }
        return strBuilder.toString();
	}
}

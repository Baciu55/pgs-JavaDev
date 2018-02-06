package pgs.javaDev;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class TreeDown implements Tree {
	
	private Integer height;
	private Character character;

	@Override
	public String print() {
		StringBuilder strBuilder = new StringBuilder();
		for (int level = 0; level < height; level++) {
            for (int i = 0; i < level; i++)
            	strBuilder.append(' ');
            	
            for (int j = 0; j < (height*2-1)-level*2 ; j++)
            	strBuilder.append(character);
            
            strBuilder.append("\n");
        }
		return strBuilder.toString();
	}
}

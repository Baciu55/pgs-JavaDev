package pgs.javaDev;

public class TreeFactory {
	
	public Tree getTree(Character character, Integer height, String direction) {
		switch (direction) {
			case "up" :
				return new TreeUp(height, character);
			case "down" :
				return new TreeDown(height, character);
			case "left" :
				return new TreeLeft(height, character);
			case "right" :
				return new TreeRight(height, character);
			default :
				return null;
		}
	}

}

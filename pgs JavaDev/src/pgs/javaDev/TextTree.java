package pgs.javaDev;

public class TextTree {
	
	private static InputScanner input = new InputScanner();
	private static Character character;
	private static Integer height;
	private static String direction;

	public static void main(String[] args) {
		character = input.getCharacter();
		height = input.getHeight();
		direction = input.getDirection();
		TreeFactory treeFactory = new TreeFactory();
		Tree tree = treeFactory.getTree(character, height, direction);
		tree.print();
	}

}

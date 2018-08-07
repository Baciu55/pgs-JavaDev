package pgs.javaDev;

public class TextTree {
	
	private static InputScanner input = new InputScanner();
	private static Character character;
	private static Integer height;
	private static String direction;

	public static void main(String[] args) {
		System.out.println("Enter tree height");
		height = input.getHeight();
		
		System.out.println("Enter cheracter to display");
		character = input.getCharacter();
		
		System.out.println("Enter direction [up, down, left, right]");
		direction = input.getDirection();
		
		TreeFactory treeFactory = new TreeFactory();
		Tree tree = new RedTreeDecorator(treeFactory.getTree(character, height, direction));
		System.out.println(tree.print());
	}

}

package pgs.javaDev;

public class TextTree {
	
	private static InputScanner input = new InputScanner();
	private static Character character;
	private static Integer height;
	private static String direction;

	public static void main(String[] args) {
		System.out.println("Podaj wysokoœæ choinki");
		height = input.getHeight();
		
		System.out.println("Podaj znak do wyœwietlenia");
		character = input.getCharacter();
		
		System.out.println("Podaj kierunek [up, down, left, right]");
		direction = input.getDirection();
		
		TreeFactory treeFactory = new TreeFactory();
		Tree tree = new RedTreeDecorator(treeFactory.getTree(character, height, direction));
		System.out.println(tree.print());
	}

}

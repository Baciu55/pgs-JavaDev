package pgs.javaDev;

public class RedTreeDecorator extends TreeDecorator {
	private final String ANSI_RED = "\u001B[31m";
	
	RedTreeDecorator(Tree tree) {
		super(tree);
	}

	@Override
	public String print() {
		return ANSI_RED + tree.print() + ANSI_RESET;
	}

}

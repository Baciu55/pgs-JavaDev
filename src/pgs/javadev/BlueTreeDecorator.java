package pgs.javaDev;

public class BlueTreeDecorator extends TreeDecorator {
	private final String ANSI_BLUE = "\u001B[34m";
	
	BlueTreeDecorator(Tree tree) {
		super(tree);
	}

	@Override
	public String print() {
		return ANSI_BLUE + tree.print() + ANSI_RESET;
	}
	
	

}

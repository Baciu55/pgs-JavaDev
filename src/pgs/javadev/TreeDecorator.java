package pgs.javaDev;

public abstract class TreeDecorator implements Tree {
	
	protected Tree tree;
	protected final String ANSI_RESET = "\u001B[0m";
	
	TreeDecorator(Tree tree) {
		this.tree = tree;
	}

}

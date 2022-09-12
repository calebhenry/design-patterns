/**
 * A type of tree decorator that adds lights to the tree
 */
public class Lights extends TreeDecorator {
    private Tree tree;

    /**
     * Creates a new tree using the tree decorator super constructor, and integrates
     * the text file for lights into the current tree lines array list
     * 
     * @param tree The tree that is going to be modified
     */
    public Lights(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("text/lights.txt"));
    }
}

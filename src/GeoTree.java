import java.util.ArrayList;

public class GeoTree {
    private final ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
    public void append(Person p1, Person p2, Relationship relationship) {
        tree.add(new Node(p1, relationship, p2));
    }


}

import java.util.ArrayList;
import java.util.Objects;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (Objects.equals(t.p1.fullName, p.fullName) && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> findCouples() {
        for (Node t : tree) {
            if (t.re == Relationship.couple) {
                var temp = String.format("%s + %s = couple", t.p1.fullName, t.p2.fullName);
                result.add(temp);
            }
        }
        return result;
    }

    public void printAll() {
        for (Node t : tree) {
            var temp = String.format("%s is %s %s", t.p2.fullName, t.p1.fullName, t.re);
            result.add(temp);
        }
        for (String s : result) {
            System.out.println(s);
        }
    }


}

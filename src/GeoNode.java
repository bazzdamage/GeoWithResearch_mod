import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GeoNode {

    Person person;
    GeoNode father;
    GeoNode mother;
    List<GeoNode> children = new ArrayList<>();

    public GeoNode(GeoNode father, GeoNode mother, Person person) {
        this.person = person;
        this.father = father;
        this.mother = mother;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void addChild(GeoNode child) {
        this.children.add(child);
    }

    public List<GeoNode> getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoNode geoNode)) return false;
        return person.equals(geoNode.person) && Objects.equals(father, geoNode.father) && Objects.equals(mother, geoNode.mother);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, father, mother);
    }

    @Override
    public String toString() {
        String f, m, p;
        p = person.toString();
        if (father != null) {
            f = father.person.toString();
        } else f = "unknown";
        if (mother != null) {
            m = mother.person.toString();
        } else m = "unknown";

        return "\n> " + p + "\nfather --> " + f + "\nmother --> " + m;
    }
}

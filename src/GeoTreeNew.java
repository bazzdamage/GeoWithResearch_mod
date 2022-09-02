import java.util.ArrayList;
import java.util.List;

public class GeoTreeNew {

    private List<GeoNode> tree = new ArrayList<>();

    public List<GeoNode> getTree() {
        return tree;
    }

    public void setTree(List<GeoNode> tree) {
        this.tree = tree;
    }

    public void addGeoNode(GeoNode Father, GeoNode Mother, Person Person) {
        GeoNode temp = new GeoNode(Father, Mother, Person);
        this.tree.add(temp);
        if (Father != null) {
            Father.addChild(temp);
        }
        if (Mother != null) {
            Mother.addChild(temp);
        }
    }
}

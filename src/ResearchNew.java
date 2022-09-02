import java.util.ArrayList;
import java.util.List;

public class ResearchNew {
    ArrayList<String> result = new ArrayList<>();
    List<GeoNode> tree;

    public ResearchNew(GeoTreeNew geoTreeNew) {
        tree = geoTreeNew.getTree();
    }

    public void printAll() {
        for (GeoNode geoNode : tree) {
            System.out.println(geoNode);
        }
    }

}

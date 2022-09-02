public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Irina");
        Person vasya = new Person("Vasya");
        Person masha = new Person("Masha");
        Person jane = new Person("Jenya");
        Person ivan = new Person("Vanya");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.append(vasya, masha, Relationship.couple);
        gt.append(jane, ivan, Relationship.couple);

//        System.out.println(new Research(gt).spend(vasya, Relationship.couple));
//        System.out.println(new Research(gt).findCouples());
//        new Research(gt).printAll();
        GeoTreeNew gtNew = new GeoTreeNew();
        GeoNode root = new GeoNode(null, null, vasya);
        GeoNode root2 = new GeoNode(null, null, masha);
        GeoNode irina1 = new GeoNode(root, root2, irina);
        GeoNode ivan1 = new GeoNode(null, null, ivan);
        GeoNode jane1 = new GeoNode(ivan1, irina1, jane);
        gtNew.addGeoNode(null, null, vasya);
        gtNew.addGeoNode(null, null, ivan);
        gtNew.addGeoNode(null, null, masha);
        gtNew.addGeoNode(root, root2, irina);
        gtNew.addGeoNode(ivan1, irina1, jane);

        new ResearchNew(gtNew).printAll();
        System.out.println("\n-----------\nChildren of Node Vasya");
        System.out.println(root.getChildren());
    }

}

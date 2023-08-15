package Relation;

public class ParentChildTester {

    public static void main(String[] args) {

        // Upcasting
        Parent parent = new Child();
        parent.business();

        Parent parent1 = new Child1();
        parent1.business();

        // Downcasting
        Child child = (Child) parent;
        child.videoCreator();
    }
}

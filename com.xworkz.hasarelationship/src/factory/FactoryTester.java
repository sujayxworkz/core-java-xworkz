package factory;


public class FactoryTester {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Machine machine = new Machine();

        factory.setFactoryName("Jay Hind");
        System.out.println("The factory name is..."+" "+factory.getFactoryName());

        factory.setNoOfMachine(26);
        System.out.println("The no. of machines in factory are..."+" "+factory.getNoOfMachine());
    }

}

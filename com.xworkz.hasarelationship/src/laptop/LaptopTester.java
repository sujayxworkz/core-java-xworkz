package laptop;

import laptop.HardDisk;
import laptop.Laptop;

public class LaptopTester {

    public static void main(String[] args) {
        HardDisk disk = new HardDisk();
        Laptop laptop = new Laptop();

        laptop.hardDisk = disk;
    }
}

package Tester;

import engineer.ComputerEngineer;
import engineer.Engineer;

public class ComputerTester {

    public static void main(String[] args) {

        Engineer engineer = new ComputerEngineer();
        engineer.solveProblem();

        ComputerEngineer computerEngineer = (ComputerEngineer) engineer;
        computerEngineer.toDevelopSoftware();
    }
}

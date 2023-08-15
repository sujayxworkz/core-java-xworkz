package Tester;

import engineer.CivilEngineer;
import engineer.Engineer;

public class CivilTester {

    public static void main(String[] args) {
        // upcasting or polymorphism
        Engineer engineer = new CivilEngineer();
        engineer.solveProblem();

        // downcasting explicit
        CivilEngineer civilEngineer = (CivilEngineer) engineer;
        civilEngineer.toBuild();

    }
}

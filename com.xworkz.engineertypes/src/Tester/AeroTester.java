package Tester;

import engineer.AeroEngineer;
import engineer.Engineer;

public class AeroTester {

    public static void main(String[] args) {

        // upcasting
        Engineer engineer = new AeroEngineer();
        engineer.solveProblem();

        // downcasting
        AeroEngineer aeroEngineer = (AeroEngineer) engineer;
        aeroEngineer.forAircraft();
    }
}

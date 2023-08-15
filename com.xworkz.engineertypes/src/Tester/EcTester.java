package Tester;

import engineer.EcEngineer;
import engineer.Engineer;

public class EcTester {

    public static void main(String[] args) {

        Engineer engineer = new EcEngineer();
        engineer.solveProblem();

        EcEngineer ecEngineer = (EcEngineer) engineer;
        ecEngineer.forElectronics();
    }
}

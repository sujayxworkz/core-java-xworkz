package Tester;

import engineer.*;

public class MechanicalTester {

    public static void main(String[] args) {






        Engineer engineer = new MechanicalEngineer();
        engineer.solveProblem();

        MechanicalEngineer mechanicalEngineer = (MechanicalEngineer) engineer;
        mechanicalEngineer.forMachines();






    }
}

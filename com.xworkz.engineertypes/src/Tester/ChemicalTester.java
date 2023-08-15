package Tester;

import engineer.ChemicalEngineer;
import engineer.Engineer;

public class ChemicalTester {

    public static void main(String[] args) {


        Engineer engineer = new ChemicalEngineer();
        engineer.solveProblem();

        ChemicalEngineer chemicalEngineer = (ChemicalEngineer) engineer;
        chemicalEngineer.studyOfChemicals();
    }
}

package Tester;

import engineer.Engineer;
import engineer.MarineEngineering;

public class MarineTester {

    public static void main(String[] args) {

        Engineer engineer = new MarineEngineering();
        engineer.solveProblem();

        MarineEngineering marineEngineering = (MarineEngineering)engineer;
        marineEngineering.seaRelated();
    }
}

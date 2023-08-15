package airport;


public class AirportTester {


        public static void main(String[] args) {

            Airport airport = new Airport();
            Terminal term = new Terminal();

            airport.setTerminal(term);
            System.out.println("The airport terminal is..."+" "+airport.getTerminal());

            airport.setAirportId(3);
            System.out.println("The airport id is..."+" "+airport.getAirportId());






        }
    }




package casting;

public class PoliceDTOTester {

    public static void main(String[] args) {
        PoliceDTO police = new PoliceDTO();
        police.setPoliceId(145);
        police.setName("shankar");
        police.setType("traffic police");
        police.setDressCode("White");

        System.out.println(police.toString());
    }
}

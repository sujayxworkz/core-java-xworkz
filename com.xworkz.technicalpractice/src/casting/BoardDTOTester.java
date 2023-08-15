package casting;

public class BoardDTOTester {

    public static void main(String[] args) {
        BoardDTO dto = new BoardDTO();
        dto.setBoardId(1);
        dto.setBoardName("SH Board");
        dto.setSize("254*56");
        dto.setPlace("Bijapur");
        dto.setNoOfMembers(124);

        System.out.println(dto.toString());
    }
}

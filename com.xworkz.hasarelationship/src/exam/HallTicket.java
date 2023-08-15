package exam;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HallTicket {
    private String subjectName;
    private String candidateName;
    private String usn;
    private String subjectCode;

    public void displayDetails(){
        System.out.println(subjectName);
        System.out.println(candidateName);
        System.out.println(usn);
        System.out.println(subjectCode);

    }
}

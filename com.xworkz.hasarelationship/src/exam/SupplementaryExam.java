package exam;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class SupplementaryExam extends Exam{
    int noOfAttempts=2;
    public SupplementaryExam(HallTicket hallTicket){
        this.hallTicket = hallTicket;
    }

    @Override
    public boolean allow(){
        System.out.println("The supplementaryexam class");
        if(noOfAttempts>1){
            return super.allow();
        }
        return false;
    }
}

package exam;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Exam {
    private int fees;
    HallTicket hallTicket;

    public Exam(){
    }
    public Exam(HallTicket ticket){

        this.hallTicket = ticket;

    }


    public  boolean allow(){
        System.out.println("The Exam class");
        boolean isAllowed = false;
        if(fees>=1775){
            System.out.println("Fee is paid...can collect your hall ticket");
            if(hallTicket!=null){
                System.out.println("Ticket details are fine");
                this.hallTicket = hallTicket;
                this.hallTicket.displayDetails();
                isAllowed = true;
                System.out.println("Details are fine...you are allowed to write exam");
            }
            else{
                System.out.println("details not found");
            }
        }
        else{
            System.out.println("no fees...no exam");
        }
        return isAllowed;
    }
}

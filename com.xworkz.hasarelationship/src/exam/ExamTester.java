package exam;

public class ExamTester {
    private static HallTicket hallTicket;



    public static void main(String[] args) {

      /*  HallTicket ticket = new HallTicket("M1","Manja","1SJ19AE036","18AE741");
        Exam exam = new Exam(ticket);
        exam.setFees(1800);
        System.out.println(exam.getFees());
        exam.allow();                              */

        // Runtime polymorphism
        Exam exam = new SupplementaryExam(hallTicket);
        exam.setFees(1800);
        exam.getFees();
        exam.allow();



    }
}

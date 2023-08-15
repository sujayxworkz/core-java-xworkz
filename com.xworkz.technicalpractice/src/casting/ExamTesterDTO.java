package casting;

public class ExamTesterDTO {

    public static void main(String[] args) {
        ExamDTO exam = new ExamDTO();
        exam.setExamId(149);
        exam.setName("English");
        exam.setDate("24-12-2023");
        exam.setSubjectCode("18ENG71");

        System.out.println(exam.toString());

    }
}

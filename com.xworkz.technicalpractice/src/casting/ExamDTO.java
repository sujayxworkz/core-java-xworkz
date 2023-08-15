package casting;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ExamDTO {


    private int examId;
    private String name;
    private String date;

    private String subjectCode;


        public String toString(){
            return "Exam-( examdId= " + this.examId + ",date=" + this.date + ",name=" + this.name + ",subjectcode="+this.subjectCode+")";

        }
}

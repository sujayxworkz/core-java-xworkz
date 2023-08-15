package casting;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Patient {
    private int patientId;
    private String patientName;
    private String patientWardNo;

    private String attenderName;
    private String patientBloodGroup;
    private int patientAge;

    @Override
    public String toString() {
        return "PatientDTO-{Patient ID=" + this.patientId + ",Name=" + this.patientName + ",Ward number=" + this.patientWardNo + ",Blood Group=" + this.patientBloodGroup + ",Attender Name=" + this.attenderName + ",Age=" + this.patientAge +"}";

    }
}


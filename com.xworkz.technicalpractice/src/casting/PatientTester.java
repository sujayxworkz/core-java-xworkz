package casting;

public class PatientTester {
    public static void main(String[] args) {
        Patient patient=new Patient();
        patient.setPatientId(1);
        patient.setPatientName("Ramu");
        patient.setPatientBloodGroup("AB+");
        patient.setPatientWardNo("D5");
        patient.setPatientAge(27);


        System.out.println(patient.toString());
    }
}

package casting;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDTO {
    private int empId;
    private String fName;
    private String lName;
    private long phoneNumber;
    private String empDepartment;


    public String toString() {
        return "EmployeeDTO-{Employee Id=" + this.empId + ",First Name=" + this.fName + ",Last Name=" + this.lName + ",Phone number=" + this.phoneNumber + ",Department=" + this.empDepartment + "}";
    }
}

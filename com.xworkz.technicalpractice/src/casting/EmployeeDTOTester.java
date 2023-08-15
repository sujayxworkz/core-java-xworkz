package casting;

public class EmployeeDTOTester {
    public static void main(String[] args) {
        EmployeeDTO employeeDTO=new EmployeeDTO();
        employeeDTO.setEmpId(101);
        employeeDTO.setFName("sujay");
        employeeDTO.setLName("hiremath");
        employeeDTO.setPhoneNumber(7338628780l);
        employeeDTO.setEmpDepartment("Software");

        System.out.println(employeeDTO);
    }
}

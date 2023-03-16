
/*
  SHAHD ALI ALSHIKHI 2111228
  
  SHAHAD AHMED ALQARNI 2111214
*/
package employeemanagement;


public class EmployeeNode {
    EmployeeNode next;
    
    String employee_name;
    int employee_id;
    String employee_firstDayOfWork;
    String employee_phoneNumber;
    String employee_address;
    int employee_workHours;
    double employee_salary;
    

    public EmployeeNode(String employee_name, int employee_id, String employee_firstDayOfWork, String employee_phoneNumber, String employee_address, int employee_workHours, double employee_salary) {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.employee_firstDayOfWork = employee_firstDayOfWork;
        this.employee_phoneNumber = employee_phoneNumber;
        this.employee_address = employee_address;
        this.employee_workHours = employee_workHours;
        this.employee_salary = employee_salary;
        this.next = null;
    }
}



/*
  SHAHD ALI ALSHIKHI 2111228
  
  SHAHAD AHMED ALQARNI 2111214
*/
package employeemanagement;

import java.util.Scanner;


public class EmployeeLinkedList {
    private EmployeeNode head;

    public EmployeeLinkedList() {
        head = null;
    }
    
    /*
     method insert record of employee in linked list
    */
    public void insertRecord(String name, int id, String firstDayOfWork, String phoneNumber, String address, int workHours, double salary) {
        EmployeeNode employee = new EmployeeNode(name, id, firstDayOfWork, phoneNumber, address, workHours, salary);
        
        //only node in the list
        if(head==null){
            head=employee;
        }
        
        //node exists in the linked list
        else{
            EmployeeNode temp = head;
            boolean status=true;
            // travarse to check if emplyee already inserted in the linked list
            while (temp != null ) {
                if(temp.employee_id == employee.employee_id){
                    status=false;
                    break;
                }
                temp = temp.next;
            }
            //if employee not inserted already then insert
            if(status){
                EmployeeNode curr = head;
                while(curr.next!= null){
                   curr = curr.next;
                }
               curr.next = employee;
            }  
            //if emplyee already inserted in the linked list print
            else{
                System.out.println("The record with this id already exists!");
            }
            
        }
    }

    /*
    method delete record of employee from linked list
    */
    public void deleteRecord(int employee_id) {
        EmployeeNode temp = head;
        EmployeeNode prev = null;
        
        
        //if its the first node in the linked list
        if (temp != null && temp.employee_id == employee_id) {
            head = temp.next;
            System.out.println(employee_id + " deleted from the list");
            return;
        }
        
        //traverse the linked list until you find employee 
        while (temp != null && temp.employee_id != employee_id) {
            prev = temp;
            temp = temp.next;
        }
        
        //if employee not found print
        if (temp == null) {
            System.out.println(employee_id + " not found in the list");
            return;
        }

        //temp stop at node you want to delete 
        //prev stop at the previous node that you want to delete
        prev.next = temp.next;
        System.out.println(employee_id + " deleted from the list");
    }

    /*
    method update the employee record
    */
   public void update(int id) {
        Scanner scan=new Scanner(System.in);
        EmployeeNode curr = head;

        while (curr != null && curr.employee_id != id) { //check if employee record exist
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println(id + " not found in the list");
            return;
        }
        System.out.println("Enter employee name:");
        curr.employee_name=scan.nextLine();
        System.out.println("Enter employee first day of work:");
        curr.employee_firstDayOfWork=scan.nextLine();
        System.out.println("Enter employee phone number:");
        curr.employee_phoneNumber=scan.nextLine();
        System.out.println("Enter employee address:");
        curr.employee_address=scan.nextLine();
        System.out.println("Enter employee working hours:");
        curr.employee_workHours=scan.nextInt();
        System.out.println("Enter employee salary:");
        curr.employee_salary=scan.nextDouble();
        System.out.println(id + " updated in the list");
  }

   /*
   method search record of the employee in linked list
   */
    public void searchRecord(int employee_id) {
        EmployeeNode temp = head;

        while (temp != null && temp.employee_id != employee_id) {//loop until you find employee record
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(employee_id + " not found in the list");
            return;
        }
        System.out.println("The record of id "+employee_id+" is shown below:");
        System.out.println("Name: "+temp.employee_name);
        System.out.println("Address: "+temp.employee_address);
        System.out.println("First Day of Work: "+temp.employee_firstDayOfWork);
        System.out.println("Phone number: "+temp.employee_phoneNumber);
        System.out.println("Working Hours: "+temp.employee_workHours);
        System.out.println("Salary: "+temp.employee_salary);
        System.out.println("");
    }
    
    /* 
    method show record display all employee records
    */
    public void showRecord(){
        EmployeeNode temp = head;

        while (temp != null) {
            System.out.println("The record of id "+temp.employee_id+" is shown below:");
            System.out.println("Name: "+temp.employee_name);
            System.out.println("Address: "+temp.employee_address);
            System.out.println("First Day of Work: "+temp.employee_firstDayOfWork);
            System.out.println("Phone number: "+temp.employee_phoneNumber);
            System.out.println("Working Hours: "+temp.employee_workHours);
            System.out.println("Salary: "+temp.employee_salary);
            System.out.println("");
            temp = temp.next;
        }
    }
    
    /*
    method update salary change spicified employee record 
    */
    public void updateSalary(int employee_id){
        EmployeeNode temp = head;

        while (temp != null && temp.employee_id != employee_id) { //loop until you find employee id
            temp = temp.next;
        }

        if (temp == null) { //record not found
            System.out.println(employee_id + " not found in the list");
            return;
        }
        if(temp.employee_workHours>32){
            int extra_hours=temp.employee_workHours-32;
            double two_percent=(temp.employee_salary/100)*2;
            temp.employee_salary=temp.employee_salary+(extra_hours*two_percent);
        }
        
    }
}

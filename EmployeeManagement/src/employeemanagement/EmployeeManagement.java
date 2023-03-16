
/*
  SHAHD ALI ALSHIKHI 2111228

  SHAHAD AHMED ALQARNI 2111214
*/
package employeemanagement;

import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String args[]){
        EmployeeLinkedList em = new EmployeeLinkedList();
        Scanner scan=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Welcome to Employee Record Management System\n");
            System.out.println("1. Insert Employee Record");
            System.out.println("2. Delete Employee Record");
            System.out.println("3. Update Employee Record");
            System.out.println("4. Search Employee Record");
            System.out.println("5. Show Employee Record");
            System.out.println("6. Update Salary by 2%");
            System.out.println("7. Quit");
            System.out.println("Please select an option:");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter employee id:");
                    int id=scan.nextInt();
                    System.out.println("Enter employee name:");
                    scan.nextLine();
                    String name=scan.nextLine();
                    System.out.println("Enter employee first day of work:");
                    String first_day=scan.nextLine();
                    System.out.println("Enter employee phone number:");
                    String phone=scan.nextLine();
                    System.out.println("Enter employee address:");
                    String address=scan.nextLine();
                    System.out.println("Enter employee working hours:");
                    int working_hours=scan.nextInt();
                    System.out.println("Enter employee salary:");
                    double salary=scan.nextDouble();
                    em.insertRecord(name, id, first_day, phone,address, working_hours, salary);
                    System.out.println("Record inserted successfully!");
                    break;
                case 2:
                    System.out.println("Enter employee id:");
                    int del_id=scan.nextInt();
                    em.deleteRecord(del_id);
                    break;
                case 3:
                    System.out.println("Enter employee id:");
                    int update_id=scan.nextInt();
                    em.update(update_id);
                    break;
                case 4:
                    System.out.println("Enter employee id:");
                    int search_id=scan.nextInt();
                    em.searchRecord(search_id);
                    break;
                case 5:
                    em.showRecord();
                    break;
                case 6:
                    System.out.println("Enter employee id:");
                    int up_salary_id=scan.nextInt();
                    em.updateSalary(up_salary_id);
                    break;
                case 7:
                    System.out.println("Thanks for using Employee Record Management System!");
                    break;
            }
           
        }while(choice!=7);
    }
    
  
}
   
    


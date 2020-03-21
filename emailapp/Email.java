package emailapp
import java.util.Scanner;

public class Email {
      private 	String firstName;
      private	String lastName;
      private	String password;
      private	String department;
      private	int mailboxCapacity;
      private	String alternateEmail;

      // Constructor will receive first/last name
      // Ask for department
      // Generate a random password
      // Set the mailboc capacity
      // Set the alternate email
      // Change the password

      public Email(Strting firstName, String lastName){
	      this.firstName  = firstName;
	      this.lastName: lastName;
	      System.out.println("Email Created: " + this.firstName + " " + this.lastName);

	      // Call a method asking for the user's department => returns the department

	      this.department = setDepartment();
	      System.out.println("Department: " + "" + this.department);
      }

      private String setDepartment() {
          System.out.println("Enter the department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
     	Scanner in =  new Scanner(System.in);
	int departmentChoice = in.nextInt();
	// Change to switch
	if(departmentChoice === 1) {return "sales"}
	else if(departmentChoice === 2) {return "dev"}
	else if(departmentChoice ===3) {return "acct"}
	else {return ""}

}

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ1234567890!@#$";

    }

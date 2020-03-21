package emailapp
import java.util.Scanner;

public class Email {
      private 	String firstName;
      private	String lastName;
      private	String password;
      private	String department;
      private	int mailboxCapacity;
      private	String alternateEmail;
      private   int defaultPasswordLength = 8;
      private   String email;
      private String companySuffix = "someCompany.com";

      // Constructor will receive first/last name
            public Email(Strting firstName, String lastName){
	      this.firstName  = firstName;
	      this.lastName: lastName;
	      System.out.println("Email Created: " + this.firstName + " " + this.lastName);

	      // Call a method asking for the user's department => returns the department
	      // Ask for department
	      this.department = setDepartment();
	      System.out.println("Department: " + "" + this.department);
	     // Generate a random password
	      this.password = randomPassword(defaultPasswordLength);

	      //Generate Email
	      this.email = firstName.toLowerCase() + "." + lastName.toLwerCase() + "@" + 
		      department + "." + companySuffix;
	      System.out.println("Your email is: " + email);
      }

      // Set the uder's department
      private String setDepartment() {
          System.out.println("Enter the department: \n1 for Sales \n2 for Development \n3 for 
			 + " Accounting \n0 for none");
     	Scanner in =  new Scanner(System.in);
	int departmentChoice = in.nextInt();
	// Change to switch
	if(departmentChoice === 1) {return "sales"}
	else if(departmentChoice === 2) {return "dev"}
	else if(departmentChoice ===3) {return "acct"}
	else {return ""}

}

     
    // generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ1234567890!@#$";
        char[] password = new char[length];
	for(int i = 0; i < length; i++){
	    int rand = (int) (Math.random() * passwordSet.length());
	    password[i] = passwordSet.charAt(rand);
	}
	return new String(password);
    }

      // Set the mailboc capacity
      public void setMailboxCapacity(int capacity){
	      this.mailboxCapacity = capacity;
      }

      // Set the alternate email
     public void setAlternateEmail(String email){
         this.alternateEmail = email;
     }
      // Change the password
     public void changePassword(){
         this.password = randomPassword(defaultPasswordLength);
     }
    // Get password
    public String getPassword(){return password}
    // Get email
    public String getEmail(){return email}
    // Get mailbox capacity
    public int getMailboxCapacity(){return mailboxCapacity}

    //Display info
    public String showInfo(){
        return "Name: " + firstName + " " + lastName
	+ "Email: " + email 
	 + "Mailbox capacity: " + mailboxCapacit + "mb";
    }

package main;
import java.util.Scanner;
public class Connection {
	public void connection() {
  		 String Profile_Name;
		 String Age;
		 String Status;
         Scanner in= new Scanner(System.in); 
         System.out.println("Welcome to *****MININET*****");
         System.out.println("Insert Detail");
         System.out.println("Profile Name");
         Profile_Name=in.nextLine();
         System.out.println("Age");
         Age=in.nextLine();
         System.out.println("Status");
         Status=in.nextLine();
         System.out.println("Profile Name:\t"+Profile_Name);
         System.out.println("Age:\t"+Age);
         System.out.println("Status:\t"+Status);
         in.close();
         }
	}
	
package main;
import java.util.Scanner;
class selectFriendshipConnections {
		public selectFriendshipConnections() {	
	}
	public void selection() {
		   System.out.println("*****Profile Netword On MININET*****");
	       System.out.println("1. Marco Van Basten");
     	   System.out.println("2. Ronaldo Luís Nazario de Lima");
		   System.out.println("3. Arnold Schwarzenegger");
		   System.out.println("4. Donald Trump");
		   System.out.println("5. Rowan Sebastian Atkinson");
		   System.out.println("Enter your choice");
		   Scanner sc=new Scanner(System.in);
		   int choice=sc.nextInt();
		   switch(choice) {
		   case 1:
        	   System.out.println("Marco Van Basten,53,Former Football Player of AC Milan and Dutch Football Manager,Friends:Rivaldo Vítor Borba Ferreirar,Ronaldo de Assis Moreira");
        	   break;
		   case 2:
			   System.out.println("Ronaldo Luís Nazario de Lima,42,Brazilian Professional Footballer,Friends:RJames Cameron,Sarah Connor");
        	   break;
		   case 3:
			   System.out.println("Arnold Schwarzenegger,70,Austrian-American Actor in Terminator Series,Friends:Barack Obama,George W. Bush");
        	   break;
		   case 4:
			   System.out.println("Donald Trump,72,The 45th and current President of the United States,Friends:Bean,Richard Curtis");
	           break;
		   case 5:
			   System.out.println("Rowan Sebastian Atkinson,62,An English actor, comedian, and screenwriter,Friends:Ronaldo Luís Nazario de Lima, Marco Van Basten");
	        	break;
        }
           sc.close();
	}

}

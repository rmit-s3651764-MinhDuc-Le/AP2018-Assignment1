package main;
import java.util.Scanner;
public abstract class Driver extends Profile {
	public Driver(String Profile_Name) {
		super(Profile_Name);// super constructor
	}
	public static void main(String args[]) {
		Profile P1 = new Profile("Marco Van Basten");// object creation
		P1.getAge(53);
		P1.getStatus("Former Football Player of AC Milan and Dutch Football Manager");
		P1.getFriendNo1("Ruud Gullit");
		P1.getFriendNo2("Frank Rijkaard");
		Profile P2 = new Profile("Ronaldo Luís Nazario de Lima");
		P2.getAge(42);
		P2.getStatus("Brazilian Professional Footballer");
		P2.getFriendNo1("Rivaldo Vítor Borba Ferreira");
		P2.getFriendNo2("Ronaldo de Assis Moreira");
		Profile P3 = new Profile("Arnold Schwarzenegger");
		P3.getAge(70);
		P3.getStatus("Austrian-American Actor in Terminator Series");
		P3.getFriendNo1("RJames Cameron");
		P3.getFriendNo2("Sarah Connor");
		Profile P4 = new Profile("Donald Trump");
		P4.getAge(72);
		P4.getStatus("The 45th and current President of the United States");
		P4.getFriendNo1("Barack Obama");
		P4.getFriendNo2("George W. Bush");
		Profile P5 = new Profile("Rowan Sebastian Atkinson");
		P5.getAge(63);
		P5.getStatus("An English actor, comedian, and screenwriter");
		P5.getFriendNo1("Bean");
		P5.getFriendNo2("Richard Curtis");
		addProfile Person = new addProfile();
		Profile profile = new Profile("Arnold Schwarzenegger");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("*****MiniNet Menu*****");// Start the menu
			System.out.println("1.Add a new profile");
			System.out.println("2.Display every profile");
			System.out.println("3.Are they direct friends?");
			System.out.println("4.Delete the profile");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("***Add a new profile***");
				Person.addPersons();
				break;
			case 2:
				System.out.println("***Display all profiles***");
				P1.displayProfile();
				P2.displayProfile();
				P3.displayProfile();
				P4.displayProfile();
				P5.displayProfile();
				break;
			case 3:
				System.out.println("***Friendship connections***");
				break;
			case 4:
				System.out.println("***Delete the profile***");
				profile.deleteProfile();
				break;
			case 5:
				return;
			}
		}

	}
}
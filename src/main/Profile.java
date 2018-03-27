package main;
import java.util.ArrayList;
public class Profile{
	 String Profile_Name;//declare variables for each profile
	 int Age;
	 String Status;
	 String Friend_No1;
	 String Friend_No2;
	public Profile(String Profile_Name) { //constructor
		this.Profile_Name = Profile_Name;
	}
	public void getAge(int Profile_Age) {
		Age = Profile_Age;
	}
	public void getStatus(String Profile_Status) {
		Status = Profile_Status;
	}
	public void getFriendNo1(String Profile_Friend_No1) {
		Friend_No1= Profile_Friend_No1;
	}
	public void getFriendNo2(String Profile_Friend_No2) {
		Friend_No2= Profile_Friend_No2;
	}
	public void displayProfile() {
		System.out.println("Name:"+Profile_Name);
		System.out.println("Age:"+Age);
		System.out.println("Status:"+Status);
		System.out.println("List of Friends\n"+Friend_No1+"\n"+Friend_No2);
	}
    public void deleteProfile() {
    	ArrayList<String> list = new ArrayList<String>(5);
    	list.add("Ronaldo Luís Nazario de Lima");
    	list.add("Arnold Schwarzenegger");
    	list.add("Donald Trump");
    	list.add("Rowan Sebastian Atkinson");
    	list.add("Dao Nhat Minh");
    	System.out.println("Profile List");
    	for(String value:list) {
    		System.out.println(" "+value);
    	}
    	list.remove(0);
    	System.out.println("New Profile List");
    	for(String value:list) {
    		System.out.println(" "+value);
    	}
    }
}

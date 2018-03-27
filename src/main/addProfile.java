package main;
import java.util.*;  
 class addDetail {
    	String Name;
		int Age;
		String Status;
		String Friend_No1;
		String Friend_No2;
    	public addDetail(String Name, int Age, String Status, String Friend_No1, String Friend_No2) {  
	    this.Name = Name;  
	    this.Age = Age;  
	    this.Status = Status;  
	    this.Friend_No1 = Friend_No1;
	    this.Friend_No2 = Friend_No2;
    	}  
	}  
	public class addProfile {  
	public void addPersons() {   
	    List<addDetail> list=new ArrayList<addDetail>();     
	    addDetail addPersons=new addDetail("Marco Van Basten",53,"Former Football Player of AC Milan and Dutch Football Manager","Ruud Gullit","Frank Rijkaard"); //create and add profiles  
	    list.add(addPersons);
	    for(addDetail d:list){  
	    System.out.println(d.Name+" "+d.Age+" "+d.Status+" "+d.Friend_No1+""+d.Friend_No2);  
	    }  
	    
	}  
	
}  

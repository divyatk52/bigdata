package bigdata;
import java.util.*;

 

class Rec  {    
String name;  
long number; 
int ID;
}

class ABook{
	Rec[] list;
	public ABook() {  
		list=new Rec[900]; 
		}
	
	//declare 'list' as an array in the constructor, remember to declare a big enough array to store all possible IDs
	
public void add(String name, long number, int ID) {
	//Wrap all the details into an object of class Record and add it to the list at the correct index
	Rec item = new Rec(); 
    item.name = name;  
    item.number = number;
    item.ID=ID;
    int a=ID-100;
    list[a]= item;		
	// Print: 'Successfully added: contact_name', where contact_name is the name of the contact added
    System.out.println("Successfully added: " + item.name);
}
public void findByID(int ID) {
	//Check if the ID exists
	//If it doesn't, print: 'No such ID exists' 
	int a = ID-100; 
	if(a>0 && list[a]!=null )
		System.out.println("Name: "+list[a].name+" Number: "+list[a].number); 
	else
		System.out.println("No such ID exists");
	//else Print: 'Name: contact_name Number: contact_number', where contact_name and contact_number are the details of the contact having that ID
}

public void delete(int ID) {
	//Check if the ID exists
	//If it doesn't, print: 'No such ID exists'      
	//else delete the item in the list having the given ID
	int a = ID-100;  
	if(a>0 && list[a]!=null )	
	{
	 String name=list[a].name;
	 list[a]=null;
     System.out.println("Successfully deleted: "+name);
	}
	else
		System.out.println("No such ID exists");
	//Print: 'Successfully deleted: contact_name', where contact_name is the name of the contact to be deleted
}
public void printAddressBook() {
	System.out.println("List of contacts:"); 
	// Print the details of all the contacts in the list in the following format:
	//Name: ABC ID: 876 Number: 123456789
	//Note that the above is just an example
	for(int a =0; a<=899; a++)
	{
		if(list[a]!=null)
	      System.out.println("Name: "+list[a].name+" ID: "+list[a].ID+" Number: "+list[a].number);  
	}
}
}
  
public class binSort {  
public static void main(String[] args) {  
	ABook myContacts = new ABook();
    myContacts.add("John", 9876123450l, 101);
    myContacts.add("Mellisa", 8360789114l, 560);
    myContacts.add("Daman",9494149900l, 444);
    myContacts.findByID(999);
    myContacts.printAddressBook();
    myContacts.delete(101);
    myContacts.add("Gregory",7289880988l, 980);
    myContacts.printAddressBook();
    myContacts.findByID(560);
    myContacts.add("Mary",7205678901l, 670);
    myContacts.delete(101);
    myContacts.findByID(670);
    myContacts.printAddressBook();      
}  
}

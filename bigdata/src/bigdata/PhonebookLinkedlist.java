package bigdata;

import java.util.*;
import java.util.LinkedList;

import com.upgrad.phonebook.Record;

class Record {    
String name;  
long number; 
}

class AddressBook{
	List<Record> list;

	//declare 'list' as a linked list in the constructor using Java's built in API's 
	public AddressBook() {  
		list=new LinkedList<Record>(); 
		}
	
public void add(String name, long number) {
	//Wrap all the details into an object of class Record and add it to the linked list
	Record item = new Record(); 
    item.number = number;
    item.name = name; 
    list.add(item);
	// Print: 'Successfully added: contact_name', where contact_name is the name of the contact added
    System.out.println("Successfully added: " + item.name);
}
public void findByNumber(long number) {	
	//Check if the number exists
	// If it doesn't, print: 'No such Number exists'      
	//else Print: 'Name: contact_name', where contact_name is the name of the contact having that number
	ListIterator<Record> x = list.listIterator();
	while (x.hasNext()) {
		Record r=x.next();
		if(number==r.number)
			{
			System.out.println("Name: " + r.name);
		    break;
			}
	}
	System.out.println("No such Number exists");
     
	
}

public void delete(long number) {
	//Check if the number exists
	// If it doesn't, print: 'No such Number exists'      
	//else delete the item in the linked list having the given number
	// Print: 'Successfully deleted: contact_number', where contact_number is the number to be deleted
	ListIterator<Record> x = list.listIterator();
	while (x.hasNext()) {
		Record r=x.next();
		if(number==r.number)
			{
			list.remove(r);
			System.out.println("Successfully deleted: "+r.number);
			break;
			}
	}
	System.out.println("No such Number exists");
}
public void printAddressBook() {
	System.out.println("List of contacts:"); 
	// Print the details of all the contacts in the list in the following format:
	//Name: ABC Number: 123456789
	//Note that the above is just an example
	ListIterator<Record> x = list.listIterator();
	while (x.hasNext()) {
		Record r=x.next();
        System.out.println("Name: "+r.name+" Number: "+r.number);
     }
}
}  
public class PhonebookLinkedlist {  
public static void main(String[] args) {  
	AddressBook myContacts = new AddressBook();
    myContacts.add("John", 9876123450l);
    myContacts.add("Mellisa", 8360789114l);
    myContacts.add("Daman",9494149900l);
    myContacts.findByNumber(9998760333l);
    myContacts.printAddressBook();
    myContacts.delete(9876123450l);
    myContacts.add("Gregory",7289880988l);
    myContacts.printAddressBook();
    myContacts.findByNumber(8360789114l);
    myContacts.add("Mary",7205678901l);
    myContacts.delete(9876123450l);
    myContacts.findByNumber(7205678901l);
    myContacts.printAddressBook();      
}  
}
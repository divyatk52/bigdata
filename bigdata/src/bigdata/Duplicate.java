package bigdata;
import java.util.LinkedList;

public class Duplicate {
	
	  public static void main(String args[]) {
	    LinkedList<String> myStrings = new LinkedList<String>();
	    int count;
	    myStrings.add("hello");
	    myStrings.add("world");
	    myStrings.add("to you");
	    myStrings.add("friend");
	    myStrings.add("hello");
	    myStrings.add("world");
	    myStrings.add("to you");
	    myStrings.add("too");
	    LinkedList<String> duplicates = new LinkedList<String>();
	    for(int i = 0; i < myStrings.size() - 1; i++) {
	String currentString = myStrings.get(i);
	     	for(int j = i + 1; j < myStrings.size(); j++) {
	        String nextString = myStrings.get(j);
	        if(currentString.equals(nextString) && !duplicates.contains(nextString)) {
	          duplicates.add(nextString);
	          break;
	        }
	      }
	    }

	    for(String string : duplicates) {
	      System.out.println(string);
	    }
	 
	    /*int n= myStrings.size();
	    for(int i=0;i<n;i++)
	    {
	    	//System.out.println(i);
	    	count=1;
		   String chk=myStrings.get(i);
		   //System.out.println(chk);
		   for(int j=i+1;j<n;j++)
		   {
			  // System.out.println(j);
		   String chk1=myStrings.get(j);
		   //System.out.println(chk1);
		   //System.out.println(chk1);
		   if(chk.equals(chk1))
		   {
			  count++;
			  //System.out.println(count);
		   }  
		   //System.out.println(count);
		   }
		   
		   if(count>1)
		   {
			 System.out.println(chk);
		   }
		   }*/
	  }
		   
		  
}
		   
		   

	 	   
	

package bigdata;
//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class practice1 {
	 public static void main(String ss[]) {
	       Scanner scanner = new Scanner(System.in);
	       int n = scanner.nextInt();
	       //System.out.println(n);
	       String strarray[]=new String[n];
	       for (int i = 0; i < strarray.length; i++) {
	    		strarray[i] = scanner.next();
	    	}
	       
	       String sortedstrarray[]=sort(strarray);
	       for(int i=0;i<sortedstrarray.length;i++)
	       {
	    	   System.out.println(sortedstrarray[i]);
	       }
	      }
 public static String[] sort(String[] strarray) {
		// TODO Auto-generated method stub
	 quickSort(strarray,0,strarray.length-1);
		return strarray;
	}
public static void quickSort(String array[], int left, int right) {
       if (left < right) 
       {
           int position = partition(array, left, right);
           quickSort(array, left, position-1);
           quickSort(array, position + 1, right);
       }
   }
     //Write your code here
   public static int partition(String[] list, int first, int last) 
	{      
	   // randomly select a pivot and swap the      
		// elements at first and at pivot      
		Random random = new Random(); 
		int p = first + random.nextInt(last - first + 1);
		swap(first, p, list);      
		// sort elements from the pivot to the last index      
		p = last; 
		int i=first-1;
		 for (int j = first; j <= last- 1; j++)
		{           
			if (list[j].length() <= list[p].length()) 
		      {               
				i++;
				swap(i, j, list);  
		     }       
	    }  
		 swap( i + 1,last, list);
		return i+1;  
		}   
	public static void swap(int i,int j, String[] list) 
	{       
		String temp = list[i];       
		list[i] = list[j];      
		list[j] = temp;   
	}
}

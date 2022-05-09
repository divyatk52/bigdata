package bigdata;

//import java.util.Arrays;
import java.util.Scanner;

public class practicequick {
   	public static int[] copyofRange(int p, int[] array) {
   		
   		swap(0, p, array);      
		// sort elements from the pivot to the last index      
		p = 0;       
		for (int i = p + 1; i < array.length; i++) 
		{           
			if (array[i] < array[p]) 
		      {               
				swap(i, p + 1, array);               
		        swap(p, p + 1, array);
		        p++;           
		     }       
	    }      
		  
   		
   		
		return array;
       //TODO
}
   	public static int[] getSubarrayGreaterThan(int pivot, int[] array) {
   		// TODO Auto-generated method stub
   		
   		int n=0;
   		for(int i=0;i<array.length;i++)
   		{
   			if(array[i]>=pivot)
   			   {
   				n++;
   			   }
   			
   		}
   		int subarray[]=new int[n];
   		int j=0;
   		for(int i=0;i<array.length;i++)
   		{
   			if(array[i]>=pivot)
   			   {
   				subarray[j]=array[i];
   				j++;
   			   }
   			
   		}
   		
   		return subarray;
   		
   	}

   	
	 
	
	public static void swap(int i, int j, int[] array) 
	{       
		int temp = array[i];       
		array[i] = array[j];      
		array[j] = temp;   
	}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
//TODO
int n = Integer.parseInt(sc.nextLine());
String input=sc.nextLine();
String[] strs = input.trim().split(" ");
int[] array=new int[n];
for (int i = 0; i < n; i++) {
	array[i] = Integer.parseInt(strs[i]);
}
int k=Integer.parseInt(sc.nextLine());
int pivot=array[k];
int copyofrange[]=copyofRange(k, array);

int subarray[]=getSubarrayGreaterThan(pivot, copyofrange);
for (int i = 0; i < subarray.length; i++) {
    System.out.println(subarray[i]);
}
}
}

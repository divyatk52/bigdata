package bigdata;
import java.util.Arrays;
import java.util.Random;
public class quicksort {   
	public static int[] sort(int[] numbers) 
	{       
		recursiveQuickSort(numbers, 0, numbers.length - 1);      
	    return numbers;   
	}   
	public static void recursiveQuickSort(int[] list, int first, int last)
	{       
		if (first < last)
		{           
			// select a pivot point          
			int p = partition(list, first, last);           
			// recursively sort the elements to the left of the pivot   
			System.out.println(Arrays.toString(list));
			recursiveQuickSort(list, first, p - 1);          
			// recursively sort the elements to the right of the pivot           
			recursiveQuickSort(list, p + 1, last);       
		} 
		
	}  
	public static int partition(int[] list, int first, int last) 
	{       // randomly select a pivot and swap the      
		// elements at first and at pivot      
		Random random = new Random();  
		//System.out.println(last - first + 1);
		//System.out.println(random.nextInt(last - first + 1));
		int p = first + random.nextInt(last - first + 1);
		//System.out.println(p);
		swap(first, p, list);      
		// sort elements from the pivot to the last index      
		p = first;       
		for (int i = p + 1; i <= last; i++) 
		{           
			if (list[i] < list[p]) 
		      {               
				swap(i, p + 1, list);               
		        swap(p, p + 1, list);
		        p++;           
		     }       
	    }      
		return p;  
		}   
	public static void swap(int i, int j, int[] array) 
	{       
		int temp = array[i];       
		array[i] = array[j];      
		array[j] = temp;   
	}
	public static void main(String args[])
	{      
		int[] randomNumbers = {5,4,2,3,1,11,12,13,44,23};       
		int[] sortedNumbers;       
		sortedNumbers = sort(randomNumbers);      
		System.out.println(Arrays.toString(sortedNumbers));      
	}
	}
		
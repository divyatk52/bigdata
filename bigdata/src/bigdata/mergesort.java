package bigdata;

import java.util.Arrays;

public class mergesort {
	 public static int[] sort ( int[] numbers,int l,int r){
		 System.out.println(l+" "+r);
         //TODO
		 if (l < r)
	        {
	            // Find the middle point
	            int m = (l+r)/2;
	            System.out.println(m);
	 
	            // Sort first and second halves
	            sort(numbers, l, m);
	            System.out.println(Arrays.toString(numbers));
	           
	            sort(numbers , m+1, r);
	            System.out.println(Arrays.toString(numbers));
	            
	 
	            // Merge the sorted halves
	            merge(numbers, l, m, r);
	            System.out.println(Arrays.toString(numbers));
	            
	        }
		 return numbers;
     }
	
		// TODO Auto-generated method stub
		
	
public static void merge(int[] numbers, int l, int m, int r) 
{
	System.out.println(l+" "+m+" "+r);
    int n1 = m - l + 1;
    int n2 = r - m;
    int L[] = new int [n1];
    int R[] = new int [n2];
    for (int i=0; i<n1; ++i)
        L[i] = numbers[l + i];
    for (int j=0; j<n2; ++j)
        R[j] = numbers[m + 1+ j];
    int i = 0, j = 0;
    int k = l;
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j])
        {
            numbers[k] = L[i];
            i++;
        }
        else
        {
            numbers[k] = R[j];
            j++;
        }
        k++;
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1)
    {
        numbers[k] = L[i];
        i++;
        k++;
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2)
    {
        numbers[k] = R[j];
        j++;
        k++;
    }
}
	//Include the method for merging two arrays over here.

 public static void main(String args[]) {
     int[] randomNumbers = {12,11,13,5,6,7};
     int[] sortedNumbers;
     sortedNumbers = sort(randomNumbers,0,randomNumbers.length-1);
     System.out.println(Arrays.toString(sortedNumbers));
}
}

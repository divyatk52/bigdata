package bigdata;

import java.util.Arrays;
import java.util.Scanner;

public class practicemerge {
	
	   public static void main(String ss[]) {
	       Scanner scanner = new Scanner(System.in);
	       int sizeArray1 = scanner.nextInt();
	       int sizeArray2 = scanner.nextInt();
	       int sortedArray1[] = getArrayInput(sizeArray1, scanner);
	       int sortedArray2[] = getArrayInput(sizeArray2, scanner);
	       int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);   
	       //Write your code here
	       System.out.println(Arrays.toString(descendingMerge));
	      }

	private static int[] mergeBothInDescendingOrder(int[] sortedArray1, int[] sortedArray2) {
		// TODO Auto-generated method stub
		int n=sortedArray1.length+sortedArray2.length;
		int merged[]=new int[n];
		for(int i=0;i<sortedArray1.length;i++)
		{
			merged[i]=sortedArray1[i];
			
		}
		for(int i=0;i<sortedArray2.length;i++)
		{
			merged[i+sortedArray1.length]=sortedArray2[i];
			
		}
		int mergesorted[]=sort(merged,0,merged.length-1);
		
		return mergesorted;
	}


	private static int[] getArrayInput(int n, Scanner scanner) {
		// TODO Auto-generated method stub
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			temp[i]=scanner.nextInt();
		}
		
		return temp;
	}
	public static int[] sort ( int[] numbers,int l,int r){
		
        //TODO
		 if (l < r)
	        {
	            
	            int m = (l+r)/2;
	            sort(numbers, l, m);
	            sort(numbers , m+1, r);
	            merge(numbers, l, m, r);
	        }
		 return numbers;
    }
	
		// TODO Auto-generated method stub
		
	
public static void merge(int[] numbers, int l, int m, int r) 
{
	
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
       if (L[i] >= R[j])
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

   
   while (i < n1)
   {
       numbers[k] = L[i];
       i++;
       k++;
   }
   while (j < n2)
   {
       numbers[k] = R[j];
       j++;
       k++;
   }

}}

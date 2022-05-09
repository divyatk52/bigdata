package bigdata;


import java.util.Scanner;

public class practice4 {
      
     
	 public static int totalBubbleSortSwaps(int[] array, int M){
    	 int swap=0;
         for (int i = 0; i < M; i++) {
      	   int flag = 0;
             for (int j = 1; j < (array.length - i); j++) {
                 if (array[j - 1] < array[j]) {
                     //swap elements
              	   flag = 1;
                     swap(j - 1, j, array);
                 }
             }
             if(flag == 0)break;
         }
         return swap;
         //return numbers; // returning the final sorted array
     }
 public static void swap(int i, int j, int[] array) {
     int temp = array[i];
     array[i] = array[j];
     array[j] = temp;
     swap++;
     
 }
 public static void main(String args[]) {
	 Scanner scanner = new Scanner(System.in);
     int M = scanner.nextInt();
     int n = scanner.nextInt();
     int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
     int totalswaps=totalBubbleSortSwaps(array,M);
     System.out.println(totalswaps);
 }
}

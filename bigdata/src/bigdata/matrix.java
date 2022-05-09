package bigdata;
import java.io.*; 

public class matrix {
	// Java program to find mean and median 
	// of sorted square matrix. 
	

	
		
	// Returns mean of a given 
	// matrix of size n x n. 
	static int findMode(int a[][], 
						int n) 
	{ 
		
		
		int maxValue = 0, maxCount = 0;
		 
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < n; j++) 
				
        {
            int count = 0;
            for (int k = 0; k < n; k++) 
    			for (int l = 0; l < n; l++) 
            {
                if (a[k][l] == a[i][j])
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = a[i][j];
            }
        }
 
        return maxValue;
	} 

	
		// Driver Code 
		public static void main (String[] args) 
		{ 
			int a[][]= {{1, 2, 3, 4}, 
						{5, 6, 7, 3}, 
						{9, 10, 2, 3}, 
						{13, 14, 2, 3}}; 
				
			int n = a.length; 
			System.out.println("Mode : " + 
								findMode(a, n)); 
			
		} 
			
			
	} 

	

package bigdata;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Hashtwosum
{
    static int getPairsCount(int n, int sum, int[] arr)
    {
        //Todo
    	int pairsCount=0;
    	HashMap<Integer,String> list = new HashMap<Integer,String>();
    	 
    	for(int i=0;i<n;i++)
    	{
    		int flag=0;
    		for(int j=i+1;j<n;j++)
    		{
    			if(arr[i]==arr[j])
    			  	flag=1;
    			else
    				flag=0;

    		}
    		if(flag==1)
    			list.put(arr[i],"multiple");
    		else 
    			list.putIfAbsent(arr[i],"single");
    	}
    	/*for(int i=0; i<arr.length; i++)
    		System.out.println(list.get(arr[i]));
    		*/
    	for(int i=0; i<arr.length; i++)
    	 {
    		if(list.containsKey(arr[i]))
    	        {
    			int complement = sum - arr[i]; 
    	        if(complement == arr[i]) 
    	        	{
    	        	String s=list.get(arr[i]);
    	        	
    	        	if(s.contentEquals("multiple"))
    	        		{
    	        		list.remove(complement);
    	        		pairsCount++;
    	        		//System.out.println(complement+" "+arr[i]);
    	        		 
    	        		}
    	        	
    	        	}  
    	        else if(list.containsKey(complement))
    	        {                
    	        	list.remove(complement);
    	            pairsCount++;
    	            //System.out.println(complement+" "+arr[i]);
    	            
    	        }
    	        }
    	        
    	 }
    	
    	  
    	return pairsCount; 
    }

    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	//Todo   
        int n=Integer.parseInt(br.readLine());
        String input=br.readLine();
        String str[]=new String[n];
        str=input.trim().split(" ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        	arr[i]=Integer.parseInt(str[i]);
        int sum=Integer.parseInt(br.readLine());
        System.out.println(getPairsCount(n,sum,arr));
        }
}

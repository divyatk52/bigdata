package bigdata;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source1 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	/*Scan the array length and then the array elements (using buffered reader) and do the required operation on each element and print.*/
        int length=Integer.valueOf(br.readLine());
        String input=br.readLine();
        String[] strs = input.trim().split(" ");
        int[] array=new int[length];
        for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(strs[i]);
        }
        for(int i=0;i<length;i++)
        {
        if((array[i]%2)!=0)
        {
        array[i]=array[i]+1;
        }
        }
        for (int i = 0; i<length; i++) 
        {
           System.out.print(array[i]+" ");	
        }
}
}

package bigdata;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hash { 
static int hashFunction(String key) {
	    //Todo
  char ch[];
  ch = key.toCharArray();
  //int keylength = key.length();

  int i, sum;
  for (sum=0, i=0; i < key.length(); i++)
    sum += (ch[i]*(i+1));
  return sum % 10;
}
public static void main(String[] args) throws IOException{  
	int[] array = new int[2];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(int i = 0;i<2;i++)
		array[i] = hashFunction(br.readLine());  
    int flag=0;
    for (int j=0;j<2;j++) {
    	for (int k=j+1;k<2;k++) {
    		 if (array[k] >9 ||array[j]>9||(k!=j && array[k] == array[j]))
             {
             	flag=1;
             	break;
             }
    	}
    	if (flag==1)
    		break;
    }
    if(flag==0)
    	System.out.println("Correct");
}  
}
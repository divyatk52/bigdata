package bigdata;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Operations{
	int a,b;
	//TODO

	public Operations(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int addition()
	{
		return a+b;
		
	}
	public int subtraction()
	{
		return a-b;
	}
	public int multiply()
	{
		return addition()*subtraction();
		
	}
	
}

public class Source {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	/*Scan input numbers (using buffered reader), call constructor of Operations class and then call multiply*/ 
    	int a,b;
    	a=Integer.parseInt(br.readLine());
    	b=Integer.parseInt(br.readLine());
    	
    	Operations op=new Operations(a,b);
    	int output=op.multiply();
    	System.out.println(output);
    	br.close();
  	
    	
    }
}

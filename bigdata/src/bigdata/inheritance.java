package bigdata;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class absdetail{
	//Include a member variable named father
	//Include getter and setter methods for this variable
	String fname;

	public String getFname() {
		return fname;
	}

	abstract public void setFname(String fname); 
	
}

interface year{
    //TODO
	int fyear=12;
	public int remainingyear(int STD);
	
}
class Stud extends absdetail{
	//Store name, ANo, STD
	String name;
	int ANo;
	int STD;
	Stud(String name,int ANo,int STD)
	{
	    this.name=name;
	    this.ANo=ANo;
	    this.STD=STD;
	}
	//Define the methods here
	@Override
	public void setFname(String fname)
	{
		this.fname = fname;
		
	}
	public String getName()
	{
	    return this.name;
	}
	public int getANo() {
		return ANo;
	}

	public int STD() {
		return STD;
	}
	public void quality(int ANo){
		//TODO
		if(ANo >= 10)
			
		{
			System.out.println("New student");
		}
		else
		{
			System.out.println("Old student");
		}
			
	}
}

class Report extends Stud implements year{
	//Store ptage and pass and also the attributes of student class(super keyword)
	private int ptage;
	private String pass;
	Report(String name,int ANo,int STD,int ptage,String pass)
	{
	    super(name,ANo,STD);
	    this.ptage=ptage;
	    this.pass=pass;
	}
	public int getPtage()
	   {
	   return this.ptage;    
	    }
	public String getpass() {
		return pass;
	}
	//implement the method here
	@Override
	public int remainingyear(int STD) {
		// TODO Auto-generated method stub
		int remyear=fyear-STD;
		return remyear;
	}
	public void quality(int ANo,int average){
		//TODO
		if (this.getANo() == ANo)
		{
			if (ptage>= average) {
				System.out.println("Above average student");
				return;
			} else {
				System.out.println("Below average student");
				return;
			}
		}
	} 
}

class Bus extends Stud {
	//Store route and BG and also the attributes of student class(super keyword)
	int route;
	String BG;
	Bus(String name,int ANo,int STD,int route,String BG)
	{
	    super(name,ANo,STD);
	    this.route=route;
	    this.BG=BG;
	}
	int getroute()
	{
	    return this.route;
	}
	    
	public String getBG() {
		return BG;
	}
	@Override
	public void quality(int ANo){
		//TODO
		if (this.getANo() == ANo)
		{
			if (route>= 20) {
				System.out.println("Out of city student");
				return;
			} else {
				System.out.println("In-city student");
				return;
			}
		}
			
	}
	
	}


public class inheritance {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String[] strNums1, strNums2;
    	strNums1 = br.readLine().split("\\s");
    	strNums2 = br.readLine().split("\\s");
    	
    	   
    	
    	/*Store these details by making objects of both classes and then with the help of if-else, return the correct output.*/
    	Report r1 = new Report(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[3]),strNums1[4]);
    	Report r2 = new Report(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[3]),strNums2[4]);
    	Bus b1 = new Bus(strNums1[0], Integer.parseInt(strNums1[1]), Integer.parseInt(strNums1[2]), Integer.parseInt(strNums1[5]),strNums1[6]);
    	Bus b2 = new Bus(strNums2[0], Integer.parseInt(strNums2[1]), Integer.parseInt(strNums2[2]), Integer.parseInt(strNums2[5]),strNums2[6]);
    	//call setFather for all objects here 
    	r1.setFname(strNums1[7]);
    	r2.setFname(strNums2[7]);
    	b1.setFname(strNums1[7]);
    	b2.setFname(strNums2[7]);
    	int n;
        n = Integer.parseInt(br.readLine());
        if(n==r1.getANo()) {
    		System.out.println(r1.getName() +" "+ r1.getPtage() + " "+b1.getroute()+ " "+b1.getFname());
    		System.out.println("You will graduate in " + r1.remainingyear(r1.STD)+ " years");
    		r1.quality(r1.getANo());
    		r1.quality(r1.getANo(),55);
    		b1.quality(r1.getANo());
    	}
    	else if(n==r2.getANo()){
    		System.out.println(r2.getName() +" "+ r2.getPtage() + " "+b2.getroute()+ " "+b2.getFname());
    		System.out.println("You will graduate in " + r2.remainingyear(r2.STD)+ " years");
    		r2.quality(r2.getANo());
    		r2.quality(r2.getANo(),55);
    		b2.quality(r2.getANo());
    	}	
        else
        {
            System.out.println("No entry found");
            
        }
        
           }
}

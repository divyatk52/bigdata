package bigdata;

import java.util.ArrayList;

public class hashprac {
	static int generateHashCode(String key) {
	    //Todo
  char ch[];
  ch = key.toCharArray();
  int keylength = key.length();

  int i, sum=0;
  for (i=0; i < key.length(); i++)
    sum = (ch[0]+keylength);
  return sum % 10;
}
	  public static void main(String args[]) {
			ArrayList<String> states = new ArrayList<String>();
			states.add("Barun");
			states.add("Mayank");
			states.add("Karan");
			states.add("Shubham");

			//Source hd = new Source();
			for (String s : states)
				System.out.println(generateHashCode(s));
		}

}

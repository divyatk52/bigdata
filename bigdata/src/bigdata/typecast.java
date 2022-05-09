package bigdata;
public class typecast {
	
	
		//private static boolean keeprunning;

		public static void main(String[] args) {
			
				int count = 2;
				int [] input = {1,2,3,4,5};
				for(int i=1;i<=count;i++)
					arrayOperation(input);
				for(int i=0;i<input.length; i++)
					System.out.print(input[i]+" ");
				}

			public static void arrayOperation(int[] input) {
				int temp = input[0];
				for(int i=0;i<input.length-1;i++)
					input[i] = input[i+1];
				input[input.length-1] = temp;
			}
		}

				
	

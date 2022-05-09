package bigdata;
import java.util.Arrays;
public class selectionsort {
	public static int[] sort ( int[] numbers){
        //TODO
		for(int i=0;i<numbers.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[j]<numbers[min])
				{
					min=j;
				}
			}
				int temp = numbers[i];
				numbers[i] = numbers[min];
				numbers[min] = temp;
			
		}
		return numbers;
    }
	//You might need a swap function also.
public static void main(String args[]) {
    int[] randomNumbers = {5,2,1,4};
    int[] sortedNumbers;
    sortedNumbers = sort(randomNumbers);
    System.out.println(Arrays.toString(sortedNumbers));
}
}

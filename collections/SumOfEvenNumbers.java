package collections;
import java.util.ArrayList;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		//Create a arraylist and add numbers into it
		ArrayList<Integer> numbers =new ArrayList<>();
		
		numbers.add(12);
		numbers.add(23);
		numbers.add(34);
		numbers.add(56);
		numbers.add(44);
		numbers.add(76);
		numbers.add(67);
		
		//Display the sum of even numbers
		int SumofEvenNumber = calculateSumofEvenNum(numbers);
		System.out.println("Sum of Even numbers: "+SumofEvenNumber);
	}
	
        //create a method to calculate sum of even numbers
	public static int calculateSumofEvenNum(ArrayList<Integer> numbers) {
		
		//Take a variable sum
		int sum = 0;
		
		//using for loop
		for(int number : numbers) {
			
			//check the added numbers are even or not
			if(number % 2 == 0) {
				sum+=number;
			}
		}
		return sum;
	}

}

//----------- output ------------------------------------

// Sum of Even numbers: 222



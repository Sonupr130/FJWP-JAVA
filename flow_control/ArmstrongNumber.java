package flow_control;

import java.util.Scanner;

public class ArmstrongNumber{
	
    //Method to calculate cube of a number
	public static int calculateCube(int num) {
		int cube=0;
		while(num>0) {
			int digit = num%10;
			cube +=(digit * digit * digit);
			num /=10;
		}
		return cube;
	}
	
	//Method to print Armstrong number
    public static void printArmstrongNumber(int start,int end) {
    	for(int i=start; i<=end; i++) {
    		int cube = calculateCube(i);
    		if(cube == i) {
    			System.out.println(i);
    		}
        }
    }

    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number from start");
    
    int start = sc.nextInt();
    System.out.println("Enter the number from end");
    
    int end = sc.nextInt();
    System.out.println("Armstrong number between " + start + " and " + end + " : ");
     
    printArmstrongNumber(start,end);
    sc.close();
}
}


//------------- OUTPUT -----------------------------

//Enter the number from start
//1
//Enter the number from end
//1000
//Armstrong number between 1 and 1000 : 
//1
//153
//370
//371
//407

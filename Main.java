

import java.io.*;
import java.util.*;
 class Calculator {

	Scanner input = new Scanner(System.in);
	boolean run = true;
	int num1,num2;
	double dnum1;
	//Menu
	void menu() {
		String a[] = {"Addtion", "Subtract", "Multiplication", "Division", "Modulus","Square root" ,"Exit"};


	
		int i=0;
		for(String arr : a){
	    System.out.println("Press " + (i + 1) + " : " + arr);
	    i++;
	}
		System.out.print("Enter your choice:");
	}
	
	
	//Add method
	int add(int num1, int num2) {
		return num1 + num2;
	}

    //Subtract method
	int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	//Multiplication method
	int mul(int num1, int num2) {
		return num1 * num2;
	}
	
    //Division method
	float div(float num1, float num2) {
		
		return num1 / num2;

	}
	
	
    //Modulus method
	int mod(int num1, int num2) {
		return num1 % num2;
	}
	
	//Square root
	double sqt(double num1){
	    return Math.sqrt(num1);
	}

    //Starting method
	void start() {
		
		while (run) {
			menu();
			int choice = input.nextInt();
			
			if(choice>7){
			  System.out.println("Invalid choice.Enter the number between 1 to 7");   
			}
			else{
			if (choice == 7) {
				System.out.println("Calculator closed...");
				this.run = false;
				break;
			}
			
			if(choice==6){
			  System.out.print("Enter a number :");
			  dnum1=input.nextDouble();
			  
			}
			else{
			System.out.print("Enter a number 1 :");
			 num1 = input.nextInt();
			System.out.print("Enter a number 2 :");
			 num2 = input.nextInt();
			input.nextLine();
			}

			switch (choice) {
			case 1:
				System.out.println("Result :" + add(num1, num2));
				break;
			case 2:
				System.out.println("Result :" + sub(num1, num2));
				break;
			case 3:
				System.out.println("Result :" + mul(num1, num2));
				break;
			case 4:
			if (num2 == 0) {
			System.out.println("can't divide by 0");
		
		}else{
				System.out.println("Result :" + div(num1, num2));
		}
				break;
			case 5:
				System.out.println("Result :" + mod(num1, num2));
				break;
			case 6:
			
			if (dnum1 < 0) {
    System.out.println("Cannot calculate square root of a negative number");
} else {
    System.out.println("Result :" + sqt(dnum1));
}
			break;
			default:
				System.out.println("Invalid choice.Enter the number between 1 to 7");
				break;
			}
			end();
			}
			
			System.out.println();
		}
	}
	
	//End method
	void end() {
		System.out.print("\nWant to do again (yes/no) :");

		String yrn = input.next();
		if (yrn.equals("yes")) {
			this.run = true;
		
		} else {

			System.out.println("\nCalculator closed...");
			this.run = false;

		}
	}





    
    	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.start();
		

	}
}


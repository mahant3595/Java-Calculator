import java.io.*;
import java.util.*;
 class Calculator {
	
		Scanner input=new Scanner(System.in);
		    boolean run=true;
		void menu(){
		String a[]={"Add","Sub","Mul","Div","Mod","Exit"};
        
		
		for(int i=0;i<=5;i++){
		System.out.println("Press "+(i+1)+" : "+a[i]);
		
		}
		System.out.print("Enter your choice:");
		}
		
		int add(int num1,int num2){
		   return num1+num2; 
		}
		
		int sub(int num1,int num2){
		   return num1-num2; 
		}
		
		int mul(int num1,int num2){
		   return num1*num2; 
		}
		
		float div(float num1,float num2){
		   if(num2==0){
		      System.out.println("can't divide by 0");
		      start(); 
		      return 0;
		   }
		   return num1/num2; 
		   
		}
		
		int mod(int num1,int num2){
		   return num1%num2; 
		}
		
		
		void start(){
		    if(!run){
		        return;
		    }
		    while(run){
		        menu();
		int choice=input.nextInt();
		if(choice==6){
		    System.out.println("Calculator closed...");
		    run=false;
		    break;
		}
		System.out.print("Enter a number 1 :");
		int num1=input.nextInt();
		System.out.print("Enter a number 2 :");
		int num2=input.nextInt();
		input.nextLine();
		
		switch(choice){
    case 1:
        System.out.println("Result :"+add(num1,num2));
        break;
    case 2:
        System.out.println("Result :"+sub(num1,num2));
        break;
    case 3:
        System.out.println("Result :"+mul(num1,num2));
        break;
    case 4:
        System.out.println("Result :"+div(num1,num2));
        break;
    case 5:
        System.out.println("Result :"+mod(num1,num2));
        break;
    default:
        System.out.println("Invalid choice.Enter the number between 1 to 6");
}
		end();
		    }
		}
		void end(){
		    System.out.print("Want to do again (yes/no) :");
		  
		    String yrn=input.nextLine();
		    if(yrn.equals("yes")){
		       run=true;
		       start();
		    }
		    else{
		        
		       System.out.println("Calculator closed...");
		    run=false; 
		        
		    }
		}
		

}

public class Main{
    public static void main(String[] args){
      Calculator calc=new Calculator();
      calc.start();
        
    }
}

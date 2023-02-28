package Calculations;
import java.util.Scanner;

class calculator{
	public calculator() {
		System.out.println("Object created\n");
	}
	public double simpleCalculator(double x,double y,char c) {
		if(c=='+') {
			return (x+y);
		}
		
		else if(c=='-') {
			return(x-y);
		}
		
		else if(c=='*') {
			return(x*y);
		}
		
		else if(c=='/') {
			return(x/y);
		}
		else {
			return (0D);
		}	
	}
	public double ScientificCalculator(double x,int i) {
		if(i==1) {
			double u =(double)(Math.sqrt(x));
			return u;
		}
		else if(i==2) {
			double u = (double)(Math.cos(x));
			return u;
		}
		else if(i==3) {
			double u = (double)(Math.sin(x));
			return u;
		}
		else if(i==4) {
			double u = (double)(Math.tan(x));
			return u;
		}
		else if(i==5) {
			double u = (double)(Math.log(x));
			return u;
		}
		else {
			System.out.println("Invalid input\n");
			return(0D);
	}   
	
	}
}

//MAIN function
public class Main {
	public static void main(String[]args ) {
	calculator obj = new calculator();
	Scanner in = new Scanner(System.in);
	
	char choice = 'Y';
	do {
		System.out.println("Please choose which calculator you would like to use:\n1.Basic Calculator\n2.Scientific Calculator\n");
		int calcOption = in.nextInt();
		switch(calcOption){
		
		case 1:
				System.out.println("Enter first value\n");
				double input1 = in.nextDouble();
			
				System.out.println("Enter second value\n");
				double input2 = in.nextDouble();
			
				System.out.println("Enter your choice: '+','-','/' or '*'\n");
				char option= in.next().charAt(0);
			
				System.out.println("Answer is:"+ obj.simpleCalculator(input1, input2, option));
				break;
				
		case 2:
				System.out.println("Enter the number of your choice\n");
				int sciNumber= in.nextInt();
				System.out.println("Choose the action to be performed on the number from the ones given below.\n1.Square Root of the Number\n2.Cosine of the number\n3.Sine of the number\n4.Tangent of the number\n5.Log of the number\n");
				int sciChoice= in.nextInt();
				System.out.println("Answer is:"+obj.ScientificCalculator(sciNumber, sciChoice));
				break;
				
		default :
				System.out.println("WRONG CHOICE\n");
				break;
		}
		System.out.println("Would you like to continue(Y/N)\n");
		choice= in.next().charAt(0);

	}while(choice=='Y'||choice=='y');
	
	if(choice!='Y'||choice!='y') {
		System.out.println("Good Bye\n");
	}
	
}
	
}



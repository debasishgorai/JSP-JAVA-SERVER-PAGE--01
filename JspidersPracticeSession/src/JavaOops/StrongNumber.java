package JavaOops;

import java.util.Scanner;

public class StrongNumber {

	
	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		
		
		return fact;
		
	}
	
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
   System.out.println("enter number");
   int num=sc.nextInt();
   int sum=0;
   int temp=num;
   while(num>0) {
	   int rem= num%10;
	   num=num/10;
	   sum=sum+factorial(rem);
	   
   }
   if(temp==sum) {
	   System.out.println("strong number");
   }
   else {
	   System.out.println("not strong number");
   }
   
	}

}

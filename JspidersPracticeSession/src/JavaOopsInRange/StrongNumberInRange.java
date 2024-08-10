package JavaOopsInRange;

import java.util.Scanner;

public class StrongNumberInRange {

	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*1;
		}
		return fact;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("enter first num: and Last Number");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    
    
  
    
    
    for(int num=num1;num<=num2;num++) {
    	int temp=num;
    	  int res=0;
    	while(num>0) {
    		
    		int rem=num%10;
    		num/=10;
    		res=res+factorial(rem);
    		
    	}
    	if(res==temp) {
    		System.out.println(temp+"");
    	}
    
    }
	}

}

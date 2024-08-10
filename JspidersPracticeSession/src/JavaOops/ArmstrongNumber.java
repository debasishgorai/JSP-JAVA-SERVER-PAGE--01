package JavaOops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static int length(int num) {
		int count=0;
		while(num>0) {
			num/=10;
			count++;
		}
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);

	System.out.println("enter the num");
	int num=sc.nextInt();
	int temp=num;
	int lennum=length(num);
	int sum=0;
	while(num>0) {
		int rem=num%10;
		num=num/10;
		sum=(int) (sum+Math.pow(rem,lennum));
		
	}
if(temp==sum) {
	System.out.println("Armstrong number");
	
}
else {
	System.out.println("not armstrong number");
}
		
		
		
	}

}

package JavaOopsInRange;

import java.util.Scanner;

public class ArmstrongNumberInRange {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner(System.in);
 System.out.println("enter num1");
 int num1=sc.nextInt();
 System.out.println("enter num2");
 int num2=sc.nextInt();
 
 


//int temp=num;
 
 for(int num=num1;num<=num2;num++) {
	 int temp=num;
	 int sum=0;
//	 int lennum=length(num);
	 while(temp>0) {
	 int rem=temp%10;
	 sum=sum+(rem*rem*rem);
	 temp/=10;
	 }
	 if(sum==num) {
		 System.out.print(num+"armstrong number");
	 } 
 
 }}

//	private static int length(int num) {
		//int count=0;
	//	while(num>0) {
	//		num/=10;
		//	count++;
	//	}
	//	return count;
	//}
	
	

}

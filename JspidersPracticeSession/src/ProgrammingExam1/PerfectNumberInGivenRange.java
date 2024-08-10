package ProgrammingExam1;

import java.util.Scanner;

public class PerfectNumberInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter fist num and last num:");
int num1=sc.nextInt();
int num2=sc.nextInt();
for(int num=num1;num<=num2;num++) {
	int sum=0;
	int temp=num;
	while(num>0) {
		for(int i=1;i<=num;i++)
		if(num%i==0) {
			sum=sum+i;
		}
		
	}
	System.out.println(temp+"perfectnumber");
	
}
		
//System.out.println(num+"perfectnumber");
		
		
	}
	

}

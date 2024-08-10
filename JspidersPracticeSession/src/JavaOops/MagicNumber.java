package JavaOops;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter num");
int num=sc.nextInt();
int sum=0;
while(num>0||sum>9) {
	if(num==0) {
		num=sum;
		sum=0;
	}
	int rem=num%10;
	num/=10;
	sum=sum+rem;
}
if(sum==1) {
	System.out.println("magic number");
}
else {
	System.out.println("not magic");
}
		
		
		
	}

}

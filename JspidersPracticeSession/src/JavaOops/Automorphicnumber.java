package JavaOops;

import java.util.Scanner;

public class Automorphicnumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}
		int square=(temp*temp);
		int div=(int) Math.pow(10, count);
		int rem=square%div;	
	
if(rem==temp) {
	System.out.println("automorphic");
}
else {
	System.out.println(" not automprphic");
}}
}

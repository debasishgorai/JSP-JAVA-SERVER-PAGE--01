package IINTERVIEWQUESTION;

public class SecondHighestNumber {
int[]a= {2,14,89,21};
System.out.println(sort(a));

	

	static int sort(int[]a) {
		int s1=a[0];
		int s2=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]==s1)continue;
			else if(a[i]>s1) 
				s2=s1;
				s1=a[i];
			
			else if(a[i]>s2||s1==s2) 
				s2=a[i];
			
		}
		return s2;
		
	
}

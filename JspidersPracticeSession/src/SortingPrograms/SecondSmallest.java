package SortingPrograms;



 
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {34,67,98,9};


	}
	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		int s1=a[0];
		int s2=a[0];
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==s1)continue;
			else if(a[i]<s1) {
				s2=s1;
				a[i]=s1;
			}else if(s1==s2|| a[i]<s2) {
				s2=a[i];
			}
			System.out.println(sort(a));
		
	}
	}

}

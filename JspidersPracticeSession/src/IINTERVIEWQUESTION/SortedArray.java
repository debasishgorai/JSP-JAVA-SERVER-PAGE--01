package IINTERVIEWQUESTION;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {12,8,62,23};
sort(a);
		for(int n:a) {
			System.out.println(n);
		}
		
	
	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
	
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length-1-i;j++) {
					if(a[j]>a[j+1]) {
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
		}
	

}

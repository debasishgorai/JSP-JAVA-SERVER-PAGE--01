package SortingPrograms;

public class FindMaximumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {12,58,112,56,517};
		int max=a[0];
		for(int i=1;i<=a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}

package SortingPrograms;

public class FindMinimumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {11,21,89,26,2,1};
int min=a[0];
for(int i=1;i<=a.length-1;i++) {
	if(a[i]<min) {
		min=a[i];
	}
}
System.out.println(min);

	}

}

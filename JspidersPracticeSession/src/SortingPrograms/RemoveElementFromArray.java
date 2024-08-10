//import java.utill.Arrays;
package SortingPrograms;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {11,23,56,65};
int removeele=1;
for(int i=removeele;i<=a.length-1;i++) {
	a[i]=a[i+1];
}


//int i = 0;
System.out.println("after removing element is:"+java.util.Arrays.toString(a));

	}

}

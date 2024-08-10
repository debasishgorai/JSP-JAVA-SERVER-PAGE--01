package SearchingPrograms;

public class BinarySearch {

	public static void main(String[] args) {
		int[]a= {14,85,23,45};
		System.out.println(search(a,14,0,a.length));

	}

	private static int search(int[]a,int ele,int start,int end) {
		
		int mid=(start+end)/2;

		if(start>end) {
		return -1;
		}
		if(a[mid]==ele)return mid;
		else if(ele<a[mid])return search(a,ele,start,mid-1);
		
		else{
			return search(a,ele,mid+1,end); 
		
	
		}}}

		
		
	



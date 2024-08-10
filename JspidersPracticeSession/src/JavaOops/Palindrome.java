package JavaOops;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "Malayalam";
String s1=s.toLowerCase();
for(int i=0;i<=s.length()-1;i++) {
	for(int j=i+1;j<=s.length()-1;j++) {
		if(ispalindrome(s1,i,j)) 
		System.out.println(s1.substring(i,j+1));
		}})
	}

 static boolean ispalindrome(String s1, int start, int end) {
		int i=start;
		int j=end;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j))
				i++;
			j--;
	return false;			
		}
		return false;
	}
	
}

package exam;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome123";
String temp=" ";
System.out.println(temp);
for(int i=s.length()-1;i>=0;i--) {
	char ch=s.charAt(i);
	temp+=ch;
}System.out.println(temp);
//System.out.println(temp);
	}
	

}

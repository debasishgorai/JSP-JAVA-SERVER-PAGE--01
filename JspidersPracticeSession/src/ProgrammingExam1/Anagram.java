package ProgrammingExam1;

public class Anagram {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(anagram("listjen","silent"));
	}

 static boolean anagram(String s1, String s2) {
		// TODO Auto-generated method stub
	while(true) {
	if(s1.length()==0 && s2.length()==0)
		return true;
 if (s1.length()!=s2.length()) return false;
 char c= s2.charAt(0);
 s1=s1.replace(c+"", "");
 s2=s2.replace(c+"", "");
	
}
 }
}

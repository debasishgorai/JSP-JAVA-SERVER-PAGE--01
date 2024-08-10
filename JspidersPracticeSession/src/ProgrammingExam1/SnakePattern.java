package ProgrammingExam1;

public class SnakePattern {

	public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		if(i%2!=0) {
			int x= ((i-1)*n)+1;
			for(int j=1;j<=n;j++) {
				System.out.print(x);
				x++;
			}
			
			
				
		
		}
		else {
		int	x=n*i;
		for(int j=1;j<=n;j++) {
			System.out.print(x);
			x--;
		}
			
					
		}
		System.out.println();
	}
	//System.out.println();

	}

}

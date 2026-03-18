import java.util.Scanner;

public class PatternPrinting {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int i;
		for(i=0;i<n;i++)
			System.out.print("* ");
		System.out.println();
    		for(i=0;i<n;i++)
			System.out.println('*');
		sc.close();
	}

}

package Java;
import java.util.Scanner;
public class powernum {
	public static void main(String[] args) {
		System.out.println("Check The Power of 2");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a value of a:"); 
		int n = sc.nextInt();
		double x = 0;
		for (int i = 0; i <= n; i++) {		
			x = Math.pow(2,i);
		}
		System.out.println("Power of the Given Number is:" +x);	
	}
}

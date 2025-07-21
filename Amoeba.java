import java.util.Scanner;

public class Amoeba
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int a = 0;
	    int b = 1;
	    
	    for(int i=0; i<n-1; i++){
	        int sum = a+b;
	        a = b;
	        b = sum;
	        
	    }
	    System.out.println(a);
	}
}

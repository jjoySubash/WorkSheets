import java.util.*;

public class Star
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner (System.in);
		
		int n = 5;
		int count = 1;
		
		for(int row=1; row<=n; row++){
		    
		    for(int col=1; col<= n - row; col++){
		        System.out.print(" ");
		    }
		    for(int j=0; j< 2 * row - 1 ; j++){
		        System.out.print("*");
		    }
		    System.out.println();
	}
}
}


// for(int j=0; j< 2 * row - 1 ; j++) --> Pyramid pattern
// for(int j=0; j< row + 1; j++) --> right angled triangle
// for(int j=0; j< 2 * (n - row) + 1; j++) --> Inverted Pyramid
import java.util.*;

public class Diamond 
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int count = 1;
		
		for(int row=1; row<=n; row++){
		    
		    for(int col=1; col< n - row + 1; col++){
		        System.out.print(" ");
		    }
		    for(int j=1; j<=row; j++){
		        System.out.print("* ");
		    }
		    System.out.println();
	   }
	   
	   for(int a=1; a<n; a++){
	       
	       for(int b=1; b<=a; b++){
	           System.out.print(" ");
	       }
	       
	       for(int c=1; c <= n-a; c++){
	           System.out.print("* ");
	       }
	       System.out.println();
	   }
    }
}


// for(int j=0; j< 2 * row - 1 ; j++) --> Pyramid pattern
// for(int j=0; j< row + 1; j++) --> right angled triangle
// for(int j=0; j< 2 * (n - row) + 1; j++) --> Inverted Pyramid

//          for(int j=row; j>=1; j--){
//		        System.out.print(j+" ");
//		    }
//		    for(int j=2; j<=row; j++){
//		        System.out.print(j+" "); --> Palindrome Triangle
		        
		        
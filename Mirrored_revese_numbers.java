import java.util.*;

public class Mirrored_revese_numbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = 5;
		
		for(int row=1; row <= n; row++){
		    for(int col=1; col <= row; col++){
		        
		        System.out.print(" ");
		    }
		    
		    int count = row;
		    for(int i=1; i <= n - row + 1; i++){
		        
		        System.out.print(count+" ");
		        count++;
		    }
		    System.out.println();
		}
		
		for(int row=2; row <= n; row++){
		    for(int col=1; col <= n - row + 1; col++){
		        
		        System.out.print(" ");
		    }
		    int val = n - row + 1;
		    for(int i=1; i <= row; i++){
		        
		        System.out.print(val+" ");
		        val++;
		    }
		    System.out.println();
		}

	}
}

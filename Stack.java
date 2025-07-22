import java.util.*;

public class Main
{
    static class Stack{
        int a[];
        int top = -1, cap;
        
        Stack(int size){
            a = new int[size];
            cap = size;
        }
        
        void push(int n){
            
            if(top == cap -1){
                System.out.println("FuLL");
                return;
            }
            
            a[++top] = n;
        }
        
        void pop(){
            
            if(top == -1){
                System.out.println("Empty");
                return;
            }
            
            top--;
        }
        
        void play(){
            for(int i=0; i<=top; i++){
                System.out.print(a[i]+" --> ");
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Stack: ");
		int s = sc.nextInt();
		Stack tk = new Stack(s);
		
		while(true){
		    System.out.print("\n1.push\n2.pop\n3.Display\n4.exit\nEnter Command: ");
		    int op = sc.nextInt();
		    
		    switch (op){
		        case 1:
		            System.out.print("Enter value to push: ");
		            int p = sc.nextInt();
		            tk.push(p);
		            break;
		      case 2:
		          tk.pop();
		          break;
		      case 3:
		          tk.play();
		          break;
		      case 4:
		          return;
		      default:
		          System.out.println("Invaid Try AGAIN!!!!");
		          break;
		            
		    }
		    
		    
		}
	}
}

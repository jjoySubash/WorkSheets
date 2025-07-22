import java.util.Scanner;

public class Main
{
    static class Queue{
        int a[];
        int rear = -1, cap;
        
        Queue(int size){
            a = new int[size];
            cap = size;
        }
        
        void Enqueue(int n){
            
            if(rear == cap -1){
                System.out.println("FuLL");
                return;
            }
            
            a[++rear] = n;
        }
        
        void Dequeue(){
            
            if(rear == -1){
                System.out.println("Empty");
                return;
            }
            
            for(int j=0; j<rear; j++){
                a[j] = a[j+1];
                
            }
            --rear;
            
        }
        
        void play(){
            for(int i=0; i<=rear; i++){
                System.out.print(a[i]+" --> ");
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the Size of the Stack: ");
		int s = sc.nextInt();
		Queue tk = new Queue(s);
		
		while(true){
		    System.out.print("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\nEnter Command: ");
		    int op = sc.nextInt();
		    
		    switch (op){
		        case 1:
		            System.out.print("Enter value to push: ");
		            int p = sc.nextInt();
		            tk.Enqueue(p);
		            break;
		      case 2:
		          tk.Dequeue();
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

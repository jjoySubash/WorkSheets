import java.util.Scanner;

public class MainStack{
    
    static class Stack{
        int a[];
        int top = -1;
        int c;
        
        Stack(int size){
            
            a = new int[size];
            c = size;
        }
        
        void push(int num){
            
            if(top == c - 1){
                System.out.print("Stack FULL");
                return;
            }
            
            a[++top] = num;
        }
        
        void pop(){
            
            if(top == -1){
                System.out.println("Empty Stack!!");
                return;
            }
            
            System.out.println("popped up "+a[top]);
            top--;
            
        }
        void display(){
            
            for(int i=0; i<=top; i++){
                System.out.println(a[i]+" ");
            }
        }
        
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            Stack s = new Stack(5);
            
            while(true){
                System.out.println("1.push\n2.pop\n3.display\n4.exit");
                int op = sc.nextInt();
                
                if(op == 1){
                    int n = sc.nextInt();
                    s.push(n);
                }
                else if(op == 2){
                    s.pop();
                }
                else if(op == 3){
                    s.display();
                }
                else if(op == 4){
                    return;
                }
                else{
                    System.out.println("INVALID!!!!");
                }
            }
        }
        

}

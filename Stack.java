
import java.util.*;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] stack = new char[a.length()];
        char[] b = a.toCharArray();
        int top = -1;

        for (int i = 0; i < a.length(); i++) {
            if (b[i] == '(' || b[i] == '{' || b[i] == '[') {
                stack[++top] = b[i];
            } else if (b[i] == ')' || b[i] == '}' || b[i] == ']') {
                if (top == -1) {
                    System.out.println("not balanced");
                    return;
                }
                char last = stack[top];
                if ((last == '(' && b[i] != ')') ||
                    (last == '[' && b[i] != ']') ||
                    (last == '{' && b[i] != '}')) {
                    System.out.println("not balanced");
                    return;
                }
                top--;
            }
        }

        if (top == -1) {
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}

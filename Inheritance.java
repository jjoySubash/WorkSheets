import java.util.*;
public class Inheritance
{
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.eat();
		
		Bird b1 = new Bird();
		b1.eat();
		b1.fly();
		
		Human h1 = new Human();
		h1.fly();
		h1.study();
	}
}
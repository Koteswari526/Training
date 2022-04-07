package innerclasses1;

public class staticnestedclass {
int x = 10;
int y = 20;
 void display() {
	System.out.println("this is outer class method");
}
static class innerclass{
	int z = 30;
	void m1() {
		System.out.println("this is m1 method");
	}
	void m2() {
		int a = 40;
		System.out.println("this is m2 method");
	}
}
public static void main(String[] args) {
	staticnestedclass obj1 = new staticnestedclass();
	staticnestedclass.innerclass obj = new staticnestedclass.innerclass();
	obj.m1();
	obj.m2();
	obj1.display();
}
}

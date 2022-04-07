package innerclasses1;

public class localinnerclass {
private int x =  10;//instance variable
void m1() {
	System.out.println("this is a m1 method");
}
void m2() {
	int z = 30;//local variable can t be private public protected
	class local{
		 private int y = 20;
		void display() {
		System.out.println("this is local class method");
		System.out.println(x);
		System.out.println(y);
		}}
	local innerobj = new local();
	innerobj.display();
}
public static void main(String[] args) {
	localinnerclass obj = new localinnerclass();
	obj.m2();
	obj.m1();
}
	}

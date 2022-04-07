package innerclasses1;

public class innerclasses {//outer class
void outermethod(){
	String animal = "dog";
	System.out.println(animal);
}
class inclass{
	String animal1 = "cat";
	void method(){
		System.out.println(animal1);
	}
	void method1() {
		System.out.println("this is a second method in inner class");
	}
}
public static void main(String[] args) {
	innerclasses obj = new innerclasses();
	innerclasses.inclass obj1 = obj.new inclass();
	obj.outermethod();
	obj1.method();
	obj1.method1();
}
}

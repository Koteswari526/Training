package exceptions;

public class finallyblock {
	public static void main(String[] args) {
	try {
int i = 20;
int j = 20/0;
}
	catch(ArithmeticException e){
		System.out.println(e);
	}
	finally {
		System.out.println("int value is not divisible by zero");
	}
	System.out.println("code is executed");
}}

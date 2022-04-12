package exceptions;

public class trycatch {
public static void main(String[] args) {
	try {
		String[] arr = {"mango","lemon","kiwi","neem"};
		int[] arr1 = {1,5,8,7};
		int index = 10;
		System.out.println(arr[index]);
		System.out.println(arr1[index]);
	}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}

		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		
	}
	System.out.println("finally executed");
}
}

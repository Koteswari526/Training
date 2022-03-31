package oops;

public class constructors {//no return type

	String languages;
	int no;
	boolean b;
	constructors(String lang){
		languages = lang;
		System.out.println(languages);
	}
	 private constructors(){
		int no = 19;
		boolean b = false;
	}
	public static void main(String[] args) {
		constructors obj1 = new constructors("java");
		constructors obj2 = new constructors("javascript");
		constructors obj3 = new constructors("java");
		constructors obj4 = new constructors();
		System.out.println(obj4.no) ;
		System.out.println(obj4.b) ;
	}
}

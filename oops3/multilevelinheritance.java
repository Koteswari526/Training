package oops3;


	class Animals{
		void eat() {
			System.out.println("eating...");
		}
		}
	class dogs extends Animals{
		void bark() {
			System.out.println("barking...");
		}
		}
	class babydog extends dogs{
		void weep() {
			System.out.println("weeping...");
		}
		}


	public class multilevelinheritance {
		 public static void main(String[] args) {
	   	  babydog d = new babydog();
	   	  d.bark();
	   	  d.eat();
	   	  d.weep();
	     }
		 
	}




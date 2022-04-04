package oops3;


	class ABC{
		   //Overridden method
		   public void disp()
		   {
			System.out.println("disp() method of parent class");
		   }	   
		}
	public class overriding extends ABC{
		   //Overriding method
		   public void disp(){
			System.out.println("disp() method of Child class");
		   }
		   public void newMethod(){
			System.out.println("new method of child class");
		   }
		   public static void main( String args[]) {
			
			ABC obj = new ABC();
			obj.disp();

			
			ABC obj2 = new overriding();
			obj2.disp();
		   }
		}


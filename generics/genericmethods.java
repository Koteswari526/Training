package generics;

public class genericmethods {
	
		  public static void main(String[] args) {

		    method m = new method();
         m.<String>Method("amith");
          m.<String>Method("age is");
          m.<Integer>Method(23);
          m.<String>Method("He is a teacher");
		  }
		}

		class method{
public <T> void Method(T data) {
		    System.out.println("Generics Method:");
		    System.out.println( data);
		  }
		}


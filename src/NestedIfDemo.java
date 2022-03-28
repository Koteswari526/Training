    import java.util.Scanner;
	public class NestedIfDemo {
		  public static void main(String[] args) {
		    int a = 20;
		    int b = 10;
		    int c = 30;
		    int num;
		    
		    if(a>b) {
		      if(a>c) {
		        num = a;
		      }
		      else
		        num = c;
		    }
		    else {
		      if(b>c) {
		        num = b;
		      }
		      else
		        num = c;
		    }
		    System.out.println("The greatest number is " + num);
		  }
		}

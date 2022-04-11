package generics;

public class genericclass {
	
		  public static void main(String[] args) {
       main<Integer> obj = new main<>(5);
		    System.out.println(obj.getData());
       main<String> obj1 = new main<>("Java Programming");
		    System.out.println(obj1.getData());
		  }
		}

	class main<T> {
private T data;
     public main(T data) {
		    this.data = data;
		  }public T getData() {
		    return this.data;
		  }
		}


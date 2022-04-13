package reflection;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;


class reflection3
{
    public static void main(String args[]) throws Exception
    {
       
        Test obj = new Test();
  Class cls = obj.getClass();
  System.out.println("The name of class is " +
                            cls.getName());
  Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +
                            constructor.getName());
  
        System.out.println("The public methods of class are : ");
  
     
        Method[] methods = cls.getMethods();
  for (Method method:methods)
            System.out.println(method.getName());
Method methodcall1 = cls.getDeclaredMethod("method2", int.class);
methodcall1.invoke(obj, 8);
 Field field = cls.getDeclaredField("s");
  field.setAccessible(true);
  field.set(obj, "john");
    }
}
	class Test
	{
	  private String s;
	  
	    public Test()  {  s = "name"; }
	  public void method1()  {
	        System.out.println("The string is " + s);
	    }
	  public void method2(int n)  {
	        System.out.println("The number is " + n);
	    }
	  private void method3() {
	        System.out.println("Private method invoked");
	    }
	}
	


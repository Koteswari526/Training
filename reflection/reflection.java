package reflection;


	class method{
		
	}
	
	  
	class reflection{  
	  void printName(Object obj){  
	  Class c=obj.getClass();    
	  System.out.println(c.getName());  
	  }  
	  public static void main(String args[]){  
	   method s=new method();  
	   
	   reflection t=new reflection();  
	   t.printName(s);  
	  
	   Class c = boolean.class;   
	   System.out.println(c.getName());  
	  
	   Class c2 = reflection.class;   
	   System.out.println(c2.getName());  
	 }} 


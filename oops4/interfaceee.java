package oops4;
interface Printable{  
		void print();  
		}  
		interface Showable{  
		void show();  
		}  
		public class interfaceee implements Printable,Showable{  
		public void print(){System.out.println("Hello");}  
		public void show(){System.out.println("Welcome");}  
		  
		public static void main(String args[]){  
		interfaceee obj = new interfaceee();  
		obj.print();  
		obj.show();  
		 }  
		}  


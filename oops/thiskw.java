package oops;

public class thiskw {
	int empid=19;
	String empname;
	float salary;
	boolean promotion;
thiskw(int empid,String empname,float salary,boolean promotion){
	this.empid=empid;
	this.empname=empname;
	this.salary=salary;
	this.promotion=promotion;}
public void display() {
	System.out.println(empid);
	System.out.println(empname);
	System.out.println(salary);
	System.out.println(promotion);
}
public static void main (String[] args) {
	thiskw emp = new thiskw(1234,"koteswari",20000,true);
	thiskw emp1 = new thiskw(1345,"ankit",30999,false);
	emp.display();
	emp1.display();
}
	
}
	


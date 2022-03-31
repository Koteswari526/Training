package oops;

public class getmethods {
 int empid;
String empname;
 float salary;
public int getid(){
	return empid;
}
public void setid(int empid) {
	this.empid=empid;
}
public String getname() {
	return empname;
}
public void setname(String empname) {
	this.empname=empname;
}
public float getsalary() {
	return salary;
	
}
public void setsalary(float salary) {
	this.salary=salary;
}
public static void main(String[] args) {
	getmethods obj = new getmethods();
	
	obj.setid(1234);
	System.out.println(obj.getid());
	System.out.println(obj.getname());
	obj.setname("koteswari");
	System.out.println(obj.getsalary());
	obj.setsalary(12000);
	obj.getsalary();
}}




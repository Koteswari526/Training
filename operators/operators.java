package operators;

public class operators {
	public static void main (String[] args) {
int a = 10;
int b = 20;
float ab = 10.0f;
double ac = 2.0;
double c=ab*ac;
System.out.println(ab*ac);
System.out.println(a+b);
System.out.println(a-b);
a+=1;
System.out.println(a);
int x = 1;
int y = 2;
int z =10;
int xy = 20;
System.out.println(x==y);
System.out.println(x!=y);
System.out.println(x==y || y==z|| z<=10);
System.out.println(x==y && y==z && z<=10);
System.out.println(x++);//1(2)
System.out.println(++x);//3
System.out.println(x--);//3(2)
System.out.println(--x);//1
System.out.println(10<<2);
//10*2^2=40
System.out.println(10<<3); //10*2^3=80
System.out.println(15<<4); //15*2^4=240
}
}
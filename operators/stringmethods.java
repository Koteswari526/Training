package operators;

public class stringmethods {
	 public static void main(String[] args) {
		   String s = "learning";
		   System.out.println(s.toUpperCase());
		   System.out.println(s.toLowerCase());
		   if (s.endsWith("g")) {
			   System.out.println("yes");
		   }
		   if (s.startsWith("e")) {
			   System.out.println("yes");
		   }
		   else {
			   System.out.println("no");
		   }
		   String S = "happy";
		   System.out.println(S.concat(s));
		   System.out.println(S.equals(s));
		   String mn = "java is a programming language";
		   String method = mn.replace("java","kava");
		   System.out.println(method);
		   System.out.println(mn.indexOf("p"));
		   System.out.println(S.compareTo(s));
		   
		   System.out.println(s.hashCode());
		   System.out.println(S.charAt(4));
		   String m = "    java is a programming language   ";
		   System.out.println(m.trim());
		   String mystr1 = "hello";
		   String mystr2 = "";
		   System.out.println(mystr1.isEmpty());
		   System.out.println(mystr2.isEmpty());
		   System.out.println(mystr1.length());
		   System.out.println(mystr1.lastIndexOf("l"));
		   System.out.println(mystr1.contains("lloe"));
		   
		}}



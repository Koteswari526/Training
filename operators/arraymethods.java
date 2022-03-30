package operators;

import java.util.Arrays;

public class arraymethods {
    public static void main(String[] args) {
	
	 int[] ia = {10,30, 20,40};
	   int[] ia1 = {11,20,30,40};
	   System.out.println(Arrays.compare(ia, ia1));
	   int intkey=20;
	   System.out.println(Arrays.binarySearch(ia,intkey));
	   System.out.println(Arrays.toString(Arrays.copyOf(ia,6)));
	   System.out.println(Arrays.equals(ia,ia1));
	   System.out.println(Arrays.mismatch(ia,ia1));
	   Arrays.sort(ia);
	   System.out.println(Arrays.toString(ia));
	   System.out.println(Arrays.toString(ia1));
	   System.out.println(ia);
	  }
	}


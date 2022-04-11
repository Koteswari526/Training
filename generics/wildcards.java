package generics;


	import java.util.ArrayList;
	import java.util.List;
	public class wildcards
	{
	    public static void main (String[]args)
	    {
	        List < Integer > intl = new ArrayList <> ();
	        intl.add (13);
	        intl.add (25);
	        intl.add (11);
	        double sum = sum (intl);
	        System.out.println ("Total Sum = " + sum);
	    }
	    public static double sum (List < ? extends Number > list)
	    {
	        double sum = 0;
	        for (Number n:list)
	        {
	         sum += n.doubleValue ();
	        }
	        return sum;
	    }
	}


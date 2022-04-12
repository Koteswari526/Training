package exceptions;
class LowBalanceException extends Exception{

}
public class customexceptions {
   public static void main(String[] args) {
	   try {
		   int balance=50;
		   int withdraw=100;
		   if (balance<withdraw) {
			   System.out.println("balance is low");
		   }
		   throw new LowBalanceException( );
	   }
	   catch(LowBalanceException e) {
		   System.out.println(e);
	   }
   }
}

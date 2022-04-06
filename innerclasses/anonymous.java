package innerclasses;

abstract class customer{
	
	abstract void buy();
}
 class anonymous{
	public static void main(String[] args) {
		customer customer = new customer() {
			void buy() {
				System.out.println("bought products");
			}
		};
		customer.buy();
	}
}
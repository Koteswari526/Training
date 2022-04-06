package innerclasses;


	interface Sstudent {
		   public void display();
		}

		class anonymousss{
		   public void createClass() {

		      // anonymous class implementing interface
		      Sstudent anonymousclass = new Sstudent() {
		         public void display() {
		            System.out.println("anonymous class.");
		         }
		      };
		      anonymousclass.display();
		   }
		}

		class interfaceanonymous {
		   public static void main(String[] args) {
		      anonymousss obj = new anonymousss();
		      obj.createClass();
		   }
		}


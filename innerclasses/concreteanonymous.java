package innerclasses;


	class Student {
		   public void display() {
		      System.out.println("student class");
		   }
		}

		class Anonymouss {
		   public void createClass() {

		      // creation of anonymous class extending class Polygon
		      Student  s = new Student() {
		         public void display() {
		            System.out.println("anonymous class.");
		         }
		      };
		      s.display();
		   }
		}

		class concreteanonymous{
		   public static void main(String[] args) {
		       Anonymouss obj = new Anonymouss();
		       obj.createClass();
		   }
		}


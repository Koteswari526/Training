package training;

public class arrayexample {
	
		  public static void main(String[] args) {
		    // array object creation
		    int array[]= new int[4]; 
		    // Storing values
		    array[0] = 21;
		    array[1] = 18;
		    array[2] = 27;
		    array[3] = 22;
		    for(int i=0; i < 4; i++){
		      System.out.println(array[i]);
		    }
		    array[1] = 10;
		    array[2] = 20;
		   
		    System.out.println("After Modification," + " Array elements are: ");
		    for(int i=0; i < 4; i++){
		      System.out.println(array[i]);
		    }
		  }
		}


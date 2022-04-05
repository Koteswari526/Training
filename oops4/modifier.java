package oops4;

 class main{
	
	    private String name;

	    // getter method
	    public String getName() {
	        return this.name;
	    }
	    // setter method
	    public void setName(String name) {
	        this.name= name;
	    }
	}
	public class modifier{
	    public static void main(String[] main){
	        main d = new main();

	        // access the private variable using the getter and setter
	        d.setName("Programiz");
	        System.out.println(d.getName());
	    }
	}


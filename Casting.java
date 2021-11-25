package OOPS;

public class Casting {

	 
	public static void main(String[] args) {

         //Parent p=new Child();//implicit upcasting
         //p.marry();
          
         // Parent p1=(Parent)new Child();//explicit upcsting
          //p1.marry();
          
          //Child c=new Parent();//implicit downcsting
          try {
          Child c1=(Child)new Parent();//explicit downcasting
          c1.marry();
          }
          catch(ClassCastException e) {
        	  System.out.println("catch block " +e.getMessage());
          }
	}

}


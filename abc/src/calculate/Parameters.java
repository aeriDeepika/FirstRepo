package calculate;

import java.util.Arrays;


public class Parameters  {


			public static void main(String[] args) {
		    	
		    	String a=args[0];
		    	String b=args[1];
		    	
		    	Calculations object= new Calculations(a, b);
		    	
		    	
		    	int[] ints=object.getA();
		    	System.out.println(Arrays.toString(ints));
		    	System.out.println("Addition of the numbers is "+ints[0]);
		    	System.out.println("Substraction of the numbers is "+ints[1]);
		    	System.out.println("Multipication of the numbers is "+ints[2]);
		    	System.out.println("Division of the numbers is "+ints[3]);
		    }
		
		
}
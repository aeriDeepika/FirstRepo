package abc;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StrInt {
	
	
	  public static void main(String[] args) 
	  {
		  String str1;
		  int cal=0;
		  
		  Scanner SC=new Scanner(System.in);
		  
		  System.out.print("Enter string that contains numbers: ");
		  str1=SC.nextLine();
		        
		    str1 = str1.replaceAll("[^0-9]+", " "); 
		    List<String> a= Arrays.asList(str1.trim().split(" "));
		    System.out.println("Numbers in given string:- " +a);

		    List<String> list = a;
		    List<Integer> newList = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
//		    System.out.println(newList);
		    
		    for(int i=0;i<newList.size();i++)
	        {
		    	cal=cal+newList.get(i);

	        }
		    System.out.println("Total of all the numbers is:- " +cal);
	  }
	 
	}
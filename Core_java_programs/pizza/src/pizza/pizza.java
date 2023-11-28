package pizza;

import java.util.Scanner;
class veg{
	
}

public class pizza {
	
  public static void main(String[] args) {
	  System.out.println("welcome to pizza mania");
	  System.out.println("select type of pizza available\nveg\nNonveg");
	  Scanner sc=new Scanner(System.in); 
	  String s=sc.next();
	  if(s.equalsIgnoreCase("veg")) {
		  System.out.println("select type of pizza\nvegstuffed\nvegNotStuffed");
		  String  stuff=sc.next();
		  
	  }
	  else {
		  System.out.println("select type of pizza\nNonVegStuffed\nNonVegNotStuffed"); 
	  }	
  }
}

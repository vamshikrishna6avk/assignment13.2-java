package StringSort;//created package as StringSort

import java.util.Arrays;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//here we are creating the class 
public class Test {
//here we are creating the main method
	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		//here we taking the original string for the sorting
		 String original = "My Name is Vamshi";
	        char[] chars = original.toCharArray();
	        //here again we sort the whole string
	        Arrays.sort(chars);
	        String sorted = new String(chars);
	        System.out.println(sorted);//system is used to return code
	           //out is a static member
      	//Println is used to print text  and gives output 
	}

}

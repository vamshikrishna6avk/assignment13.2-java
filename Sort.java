package StringSort;//created package as StringSort

import java.util.Arrays;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//here we are cretaing the class
public class Sort {
//here we are creating the main method
	public static void main(String[] args) {
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		
	//here we take the String	
	String str= "My name is Vamshi";
	//here we are spliting the string
	String[] arr= str.split(" ");
	

	//here we are intialising the length of the loop
	for (String el: arr){
		System.out.println(el +",");//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output 
	}
	//here we create the object for sorting the array
	Sort s1=new Sort();
	s1.SortArray();
	}
	//here we are creating the method of sort aaray
	void SortArray(){
		String original ="My name is Vamshi";
      
		String[] arr = original.split(" ");
		System.out.println("Now sorting internally");//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output 
		for(int i=0;i<arr.length;i++){
			//here we are initializing the length of the character array
			char[] ch=arr[i].toCharArray();
			//here we are sorting our character internally
			Arrays.sort(ch);
			System.out.println(ch);//system is used to return code
	           //out is a static member
      	//Println is used to print text  and gives output 
		}
     
	}
}
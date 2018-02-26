package cholitha;

public class Constructor {
	
	public Constructor()
	 { // Default public constructDemo() 
		{
			System.out.println(" I am in the constructor");
		}
		System.out.println(" I am in the constructor lecture 1");
		
	 }	
		
		// Parameterized constructor
		public Constructor(int a, int b)
		{ System.out.println(" I am in the parameterized constructor"); 
		
		}
		 
		
		public Constructor(String str)
		
		{ System.out.println(str); 
		
		}
		 


		public void getdata() 
		
		{ 
			System.out.println("I am the method");
			}

		
		//will not return values //name of constructor should be the class name
		
public static void main(String[] args) { 
	/*// TODO Auto-generated method stub 
	Constructor cd= new Constructor(); 
	Constructor cds= new Constructor("hello");
	Constructor c= new Constructor(4,5); 
	// compiler will call implict constructor if you have not defined constructor block //when ever you create an object constructor is called //block of code when ever an object is created 
	*/
}
}
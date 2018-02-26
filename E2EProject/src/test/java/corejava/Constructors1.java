package corejava;

public class Constructors1 {

	
	public static void add() {
		int a =90;
		int b =80;
		int c = a+b ;
		
		System.out.println(c);
	}
	
	Constructors1()
	{
		System.out.println("I Am a Constructors1");
	}
	
	
	public static void main(String[] args) {
		add();
	}

}

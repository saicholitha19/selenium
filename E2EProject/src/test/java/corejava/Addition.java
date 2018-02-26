package corejava;

public class Addition {
	static final int a = 80;
	static final int b = 60;
	static int c;

	// Data types
	// Primitive data types: Byte, short, int,long,float,double,boolean,char
	// Non primitive datatypes: String Array..

	private static void add() {
//		a = n;
//		b = 80;
		c = a + b;
		System.out.println("add" + c);

	}

	private void sub() {
		// add();
		c = a - b;
		System.out.println("sub" + c);
	}

	public static void main(String[] args) {
		add();

		// Create object for class and call with the help of reference name any method
		// into the same class or some other calss
		// syntax: classname object = new classname();
		Addition obj = new Addition();
		obj.sub();

		// sub();

	}

}

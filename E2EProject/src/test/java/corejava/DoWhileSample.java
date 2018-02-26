package corejava;

public class DoWhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =90;
		do {
			System.out.println(a);
			
			if(a>95) {//90>95
				System.out.println("Test");
				break;
			}
			
			a++;//91
			
		} while (a>90);
		
		
		
	}

}

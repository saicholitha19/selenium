package corejava;

public class LoopingStmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print 1 - 10 numbers
		for (int i = 1; i < 11; i++) {
			System.out.println(i);

		}
		
		System.out.println("*************************");
		// Do-While
		int i = 1;
		do {
			System.out.println(i);
			i++;

		} while (i < 11);
		
		System.out.println("*************************");
		
		int j=1;
		while (j<11) {
			System.out.println(j);
			j++;
		}

	}

}

package corejava;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "one,two,three,four,five,six,seven";

		String s[] = str.split(","); // Declaration and assign
		System.out.println(s.length);// Count of values in s array
		
		for (int i = 0; i < s.length; i++) {
			// System.out.println(s[i]);
			if (s[i].equalsIgnoreCase("three")) {
				System.out.println(" Three text is Available");
			} else {
				System.out.println(s[i] + " is not matching with Three text");
			}
		} // For loop End

	}

}

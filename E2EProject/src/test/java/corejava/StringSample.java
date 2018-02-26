package corejava;

public class StringSample {

	public static void main(String[] args) {
		// String Length
		String str;//= "H2o Testing Tools";
		str = "H2o Testing Tools";
		int len = str.length();
		System.out.println("String Length is : " + len);

		// Concatenating Strings
		String string1 = "Welcomes you..! ";
		System.out.println(str + " : " + string1);

		// String charAt()
		String s = "Strings are immutable";
		char result = s.charAt(9);
		System.out.println("Inside String  9 position Character is:" + result);

		/*// String toString()
		String Str = new String("Welcome to H2oTestingTools.com");
		System.out.print("Return Value :");
		System.out.println(Str.toString());*/

		// String toUpperCase()
		String StrUpper = new String("Welcome to H2oTestingTools.com");
		System.out.print("Return Value :");
		System.out.println(StrUpper.toUpperCase());

		// String toLowerCase()
		String StrLower = new String("Welcome to H2oTestingTools.com");

		System.out.print("Return Value :");
		System.out.println(StrLower.toLowerCase());

		// String trim()
		String StrTrim = new String("            Welcome to H2oTestingTools.com");
		System.out.print("Return Value :");
		System.out.println(StrTrim.trim());
		System.out.println("withoutTrim:" + StrTrim);
/*  
		// String valueOf()
		double d = 109.939;
		boolean b = true;
		long l = 1232874;
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		System.out.println("Return Value : " + String.valueOf(d));
		System.out.println("Return Value : " + String.valueOf(b));
		System.out.println("Return Value : " + String.valueOf(l));
		System.out.println("Return Value : " + String.valueOf(arr));

		// String substring()
		String StrToSubString = new String("Welcome to H2oTestingTools.com");
		System.out.print("Return Value :");
		System.out.println(StrToSubString.substring(10));

		System.out.print("Return Value :");
		System.out.println(Str.substring(10, 15));

		// String subSequence()
		String StrsubSequence = new String("Welcome to H2oTestingTools.com");
		System.out.print("Return Value :");
		System.out.println(StrsubSequence.subSequence(0, 10));

		System.out.print("Return Value :");
		System.out.println(StrsubSequence.subSequence(10, 15));
*/ 
		// String replaceFirst()
		String StrreplaceFirst = new String("Welcome to H2oTestingTools.com");
		System.out.print("Return Value :");
		System.out.println(StrreplaceFirst.replaceFirst("(.*)H2oTesting(.*)", "NSReddy"));

		System.out.print("Return Value :");
		System.out.println(StrreplaceFirst.replaceFirst("H2oTesting", "NSReddy"));

		// String replace()
		String Str111 = new String("Welcome to H2oTestingTools.com");
		System.out.print("Return Value :");
		System.out.println(Str111.replace('o', 'T'));

		System.out.print("Return Value :");
		System.out.println(Str111.replace('l', 'D'));

	/*	// Using Integer.valueOf
		String str = "-234";
		int num1 = 110;
		// num2 would be having a negative value
		int num2 = Integer.valueOf(str);
		int sum = num1 + num2;
		System.out.println("Result is: " + sum);*/

		// Using Integer.parseInt
		String strab = "123";
		int num1 = 100;
		int num2 = Integer.parseInt(strab);
		int sum = num1 + num2;
		System.out.println("Result is: " + sum);

		// String equals() and equalsIgnoreCase() Methods example
		String str1 = new String("Apple");
		String str2 = new String("MANGO");
		String str3 = new String("APPLE");
		System.out.println("str1 equals to str2:" + str1.equalsIgnoreCase(str2));
		System.out.println("str1 equals to str3:" + str1.equalsIgnoreCase(str3));

		String str11 = new String("Hello");
		String str22 = new String("Hi");
		String str33 = new String("Hello");
		System.out.println("str1 equals to str2:" + str11.equals(str22));
		System.out.println("str1 equals to str3:" + str11.equals(str33));

}

}

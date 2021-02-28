package chapter04dersteYapilanlar;

public class SubstringOrnegi {
	public static void main(String[] args) {
		String str = "Merhaba Java";
		
		String str2 = str.substring(6);
		System.out.println(str2);
		
		str2 = str.substring(3, 7);
		System.out.println(str2);
		
		str2 = str.replace("haba", "gurkan");
		System.out.println(str2);
	
		String message = "Welcome to Java";
		message = message.substring(0, 11) + "HTML";
		System.out.println(message);


		System.out.println("-----------------------------------------------------");
		System.out.println("Welcome to Java".indexOf('W'));
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));
		System.out.println("Welcome to Java".indexOf("Java", 5));
		System.out.println("Welcome to Java".indexOf("java", 5));
		System.out.println("-----------------------------------------------------");
		System.out.println("Welcome to Java".lastIndexOf('W'));
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o', 5));
		System.out.println("Welcome to comeJava".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));
		System.out.println("Welcome to Java".lastIndexOf("Java"));
		
	}
}

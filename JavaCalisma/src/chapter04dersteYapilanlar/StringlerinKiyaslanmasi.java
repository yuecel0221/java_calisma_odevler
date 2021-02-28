package chapter04dersteYapilanlar;

public class StringlerinKiyaslanmasi {

	public static void main(String[] args) {
		String str1 = "merhaba java";
		String str2 = "    MerHAba java    \n\t";
		
		boolean b = str1.equalsIgnoreCase(str2.trim());
		if (b) {
			System.out.println("iki string birbirine esit");
		} else {
			System.out.println("iki string birbirine esit degil");
		}
		
		str1 = "jave";
		str2 = "java";
		int kiyaslamaDegeri = compareTo(str1, str2);
		
		if (kiyaslamaDegeri == 0) {
			System.out.println(str1 + " esittir " + str2 + " ye");
		} else if (kiyaslamaDegeri > 0) {
			System.out.println(str1 + " buyuktur " + str2 + " den");
		} else {
			System.out.println(str1 + " kucuktur " + str2 + " den");
		}
		
		str1 = "Welcome to Java";
		System.out.println(str1.startsWith("We"));
		System.out.println("Welcome to Java".startsWith("we"));
		System.out.println("Welcome to Java".endsWith("va"));
		System.out.println("Welcome to Java".endsWith("v"));
		System.out.println("Welcome to Java".contains("to"));
		System.out.println("Welcome to Java".contains("To"));

	}

	private static int compareTo(String str1, String str2) {
		if (str1.length() != str2.length()) {
			if (str1.length() > str2.length()) {
				return 1;
			} else {
				return -1;
			}
		}

		for (int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if (ch1 != ch2) {
				return ch1 - ch2;
			}
		}
		return 0;
	}

}

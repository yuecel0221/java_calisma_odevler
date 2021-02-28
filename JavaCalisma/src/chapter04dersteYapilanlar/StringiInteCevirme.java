package chapter04dersteYapilanlar;

public class StringiInteCevirme {
	public static void main(String[] args) {
		String str = "12345";
		
		int sayi = Integer.parseInt(str);
		
		System.out.println(sayi);
		
		double doubleValue = Double.parseDouble("    \t55.78 \n");
		System.out.println(doubleValue);
	}
}

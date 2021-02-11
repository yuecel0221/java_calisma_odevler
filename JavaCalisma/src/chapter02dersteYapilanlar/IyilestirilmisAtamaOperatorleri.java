package chapter02dersteYapilanlar;

public class IyilestirilmisAtamaOperatorleri {
	public static void main(String[] args) {

		int sayi = 10;
		sayi = sayi + 5;
		System.out.println(sayi);
		
		
		int sayi2 = 10;
		sayi += 5;
		System.out.println(sayi2);
		
		int a, b, c, d;
		
		d = 5;
		
		a = b = c = d += 10;
		
		System.out.println(a);
	}

}

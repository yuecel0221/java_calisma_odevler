package chapter04dersteYapilanlar;

import java.util.Scanner;

public class KarakterAnalizi {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		String girdi = klavye.next();
		char ch = girdi.charAt(0);
		
		if ('A' <= ch && ch <= 'Z') {
			System.out.println(ch + " buyuk harf");
		} else if ('a' <= ch && ch <= 'z')
			System.out.println(ch + " kucuk harf");
		else if ('0' <= ch && ch <= '9')
			System.out.println(ch + " rakam");
	}

}

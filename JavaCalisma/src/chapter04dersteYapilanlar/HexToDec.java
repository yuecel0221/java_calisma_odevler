package chapter04dersteYapilanlar;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class HexToDec {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Bir hex sayi giriniz: ");
		String girdi = klavye.next();
		
		if (girdi.length() != 1) {
			System.err.println("Tek karakter girilmeliydi!");
			System.exit(0);
		}
		
		char ch = girdi.toLowerCase().charAt(0);
		int sayi = 0;
		
		if ('a' <= ch && ch <= 'f') {
			sayi = ch - 'a' + 10;
		} else if ('0' <= ch && ch <= '9') {
			sayi = ch - '0';
		} else {
			System.err.println("Hatali giris");
			System.exit(0);
		}
		
		System.out.println("Hex " + ch + " nin degeri: " + sayi);
		
	}

}

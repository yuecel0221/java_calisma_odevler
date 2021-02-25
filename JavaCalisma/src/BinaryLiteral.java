
public class BinaryLiteral {

	public static void main(String[] args) {
		System.out.println(1 - 0.9);
		System.out.println(1 - 0.9F);
		System.out.println(1 / 3.0);
		System.out.println(1 / 3.0F);
		
		double d = 128;
		
		byte b = 0B01111101;
		System.out.println(b);
		
		System.out.println((char) 67);
		
		char ch = 65;
		int i = ch;
		
		System.out.println(i);
		System.out.println(ch);
/*
		for ( ch = 0; ch < 65000; ch++) {
			System.out.print(ch + " ");
			
			if ((ch + 1) % 50 == 0) 
				System.out.println();
		}
		*/
	}

}

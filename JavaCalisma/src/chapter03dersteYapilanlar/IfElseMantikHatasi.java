package chapter03dersteYapilanlar;

public class IfElseMantikHatasi {

	public static void main(String[] args) {
		
		int score = 83;

		if (score >= 90.0)
			System.out.print("A");
		else if (score >= 80.0)
			System.out.print("B");
		else if (score >= 70.0)
			System.out.print("C");
		else if (score >= 60.0)
			System.out.print("D");
		else
			System.out.print("F");
	}

}

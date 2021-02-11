package bolum01.exercises;

public class B01E13 {
	public static void main(String[] args) {

		double a = 3.14;
		double b = 50.2;
		double e = 44.5;

		double c = 2.1;
		double d = 0.55;
		double f = 5.9;

		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		System.out.println("x = " + (int) (x * 100) / 100.0);
		System.out.println("y = " + (int) (y * 100) / 100.0);

	}
}

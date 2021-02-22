package chapter03dersteYapilanlar;

public class KosulOperatoru {
	public static void main(String[] args) {
		
		int x = 5;
		int y;
		
		if (x > 0) {
			y = 1;
		} else {
			y = -1;
		}
		
		y = (x > 0) ? 1 : -1;
		
		
	
		int z = 6;
		int w = 9;
		y = (x > 0) ? (z < 0) ? -10 : 15 : (w > 0) ? 5 : 9;
		
		if (x > 0) {
			if (z < 0) {
				y = -10; 
			} else {
				y = 15;
			}
		} else {
			if (w > 0) {
				y = 5;
			} else {
				y = 9;
			}
		}
		
	}
}

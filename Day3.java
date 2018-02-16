import java.lang.Math; 

public class Day3 {
	public static int intFinder(int n) {
		int boxLayer = 1; //2
		int i = 1; //5
		int x = 0; //2
		while(true) {
			if (n <= i * i && n >= (i * i - (2 * (int) Math.pow(2, x + 1)) + 1)) {
				return boxLayer;
			}
			boxLayer++;
			i+=2;
			x++;
		}
	}
	
	public static int dimensionFinder(int n) {
		int i = 1; //5
		int x = 0; //2
		while(true) {
			if (n <= i * i && n >= (i * i - (2 * (int) Math.pow(2, x + 1)) + 1)) {
				return i;
			}
			i+=2;
			x++;
		}
	}
	
	public static int lowest(int n) {
		int i = 1; //5
		int x = 0; //2
		while(true) {
			if (n <= i * i && n >= (i * i - (2 * (int) Math.pow(2, x + 1)) + 1)) {
				return (i * i - (2 * (int) Math.pow(2, x + 1)) + 1);
			}
			i+=2;
			x++;
		}
	}
	
	public static int distanceFinder(int n) {
		int layer = intFinder(n);
		int dimension = dimensionFinder(n);
		int median = (int) ((double)dimension / 2.0 + 0.5);
		int offset = n - lowest(n);
		int x = offset % dimension;
		x = Math.abs(median - x);
		x += layer;
		x--;
		return x;
	}
	
	public static void main(String args[]) {
		System.out.println(distanceFinder(277676));
	   }
	
}

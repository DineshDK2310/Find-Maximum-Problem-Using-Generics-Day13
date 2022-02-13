package Generics;

public class FindMaximumFloats <E> {
	E x, y, z;

	public FindMaximumFloats(E x, E y, E z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static  <T extends Comparable<T>> Double testMaximum(Double x, Double y, Double z) {
		Double maximum = x;
		if(y.compareTo(maximum) > 0) {
			maximum = y;
		}

		if(z.compareTo(maximum) > 0) {
			maximum = z;
		}
		printMaximum(x,y,z,maximum);
		return maximum;
	}

	public static void printMaximum(Double x, Double y, Double z, Double maximum) {
		System.out.printf("Max of %s, %s and %s is %s\n",x,y,z, maximum);		
	}

	public static void main(String[] args) {
		Double xF1= 4.4, yF2 = 11.1, zF3 = 9.9;
		new FindMaximumFloats(xF1,yF2,zF3).testMaximum(xF1, yF2, zF3);
	}


}



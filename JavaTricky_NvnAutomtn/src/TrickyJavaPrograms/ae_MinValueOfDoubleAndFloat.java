package TrickyJavaPrograms;

public class ae_MinValueOfDoubleAndFloat {

	public static void main(String[] args) {
		System.out.println(Double.MIN_VALUE);  //Min value of double is a positive number
		System.out.println(Float.MIN_VALUE); //Min value of float is a positive number
		
		System.out.println(Long.MIN_VALUE);  //Min value of long is a -ve number
		System.out.println(Integer.MIN_VALUE); //Min value of integer is a -ve number
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); //0.0d is min value
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f)); //0.0f is min value

		System.out.println(Math.min(Integer.MIN_VALUE, 0)); //minimum integer value is -ve. So, it's less than 0
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); //-ve infinity is min cz min value of double is positive


	}

}

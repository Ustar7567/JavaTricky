package TrickyJavaPrograms;

public class af_CompareTwoIntergerNums {

	public static void main(String[] args) {
		
		//Works based on integer caching (Integer caching range is -128 to 127)

		Integer a = 223;
		Integer b = 223;

		if (a == b) {
			System.out.println("Pass");//Pass only if the a and b values are within -128 and 127 range

		}
		else {
			System.out.println("Fail");//Fail if a and b values are beyond -128 and 127
		}
	}

}

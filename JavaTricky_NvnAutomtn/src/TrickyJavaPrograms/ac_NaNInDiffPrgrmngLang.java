package TrickyJavaPrograms;

public class ac_NaNInDiffPrgrmngLang {

	public static void main(String[] args) {
		//NAN is an undefined number like 0.0/0.0 or Math.sqrt(-1)
		
		System.out.println(Float.NaN==Float.NaN); //cz sys can't compare two undefined numbers
		System.out.println(Float.NaN!=Float.NaN); //cz undefined numbers are different always
		
		//0.0/0.0 nan in js
		//0.0/0.0 -ve number in c
		//0.0/0.0 nan in c++ and C#
		
		

	}

}

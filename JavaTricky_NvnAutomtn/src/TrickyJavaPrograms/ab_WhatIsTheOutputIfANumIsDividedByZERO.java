package TrickyJavaPrograms;

public class ab_WhatIsTheOutputIfANumIsDividedByZERO {

	public static void main(String[] args) {
		System.out.println(10.0f/0); //float num divided by int 0
		System.out.println(10.0f/0.0f); //float num divided by float 0
		System.out.println(10.00000000d/0); //double num divided by int 0
		System.out.println(10/0.0f);//int num divided by float or double
		System.out.println(10.0000000d/0.0000000000000d); //double num divided by double 0
		System.out.println(0.0f/0);//float 0 divided by int 0
		System.out.println(0.0f/0.0f); //float 0 divided by float 0
		System.out.println(0.000d/0); //double 0 divided by int 0
		System.out.println(0.000000d/0.000000d); //double 0 divided by double 0
		System.out.println(0/0.0);//int 0 divided by float or double 0
		System.out.println(0/0);//int 0 divided by int 0 Output is an arithmetic exception "/by zero"
		System.out.println(10/0); //int num divided by int 0 Output is an arithmetic exception "/by zero"
		System.out.println(1087984344342345457l/0); //long num divided by int 0 Output is an arithmetic exception "/by zero"
		
//When int or long is divided by int or long 0, only then arithmetic exception occurs


	}

}

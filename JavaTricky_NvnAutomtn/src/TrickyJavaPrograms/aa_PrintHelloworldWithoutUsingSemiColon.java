package TrickyJavaPrograms;

public class aa_PrintHelloworldWithoutUsingSemiColon {

	public static void main(String[] args) {
		// Normal method with semicolon
		// System.out.println("HelloWorld!");

		// Tricky method without semicolon
		// 1
		if (System.out.printf("HelloWorld!\n") == null) {

		}
		// 2
		if (System.out.append("HelloWorld!\n") == null) {

		}
		// 3
		if (System.out.append("HelloWorld!\n").equals(null)) {

		}
		//4
		for(int i=0;i<1;System.out.printf("HelloWorld!")) {
			i++;
		}

	}
}

package TrickyJavaPrograms;

public class a_printing1to100WithoutUsingNumsInCode {

	public static void main(String[] args) {
		//Normal method
		//for(int i=1;i<=100;i++) {
		//	System.out.println(i);
		//}
		
		//Method 1-without using numbers in the code
		int a='A'/'A';//result is 1
		String s="..........";
		for(int i=a;i<=s.length()*s.length();i++) {
			System.out.println(i);
		}
		//Method 2-without using numbers in the code
		int x='z'/'z';
		for(int i=x;i<='d';i++) {  //ASCII value of character 'a' is 97,b:98,c:99,d:100
			System.out.println(i);
		}

	}

}

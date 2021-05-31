package TrickyJavaPrograms;

public class ag_WillStaticBlockBeExecutedWithFinalVariable {

	public static void main(String[] args) {	
		System.out.println(MyClass.x);//as x is declared as final, in this line, system takes the MyClass.x block as 100
		//But the other static code is not executed in this case.
		//If line 13 has no final keyword, then output will be My class\n 100
	}
}

 class MyClass{
	public static final  int x=100;
	static {
		System.out.println("My class");
	}
}

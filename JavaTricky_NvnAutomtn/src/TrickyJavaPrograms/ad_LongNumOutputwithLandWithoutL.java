package TrickyJavaPrograms;

public class ad_LongNumOutputwithLandWithoutL {

	public static void main(String[] args) {
		
		long woutL=2332*323*2323*4343;
		System.out.println(woutL); //1441924580 (This is the 32 bit representation of the actual result 7599239071204)
		long wL=2332*323*2323*4343L;
		System.out.println(wL); //7599239071204

	}

}
//So, when we append L for a long number, it gives the actual output
//When we don't append L for a long number, it gives the 32 bit representation of the actual output by removing the four most significant bits from the binary representation

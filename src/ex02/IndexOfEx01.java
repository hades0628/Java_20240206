package ex02;

public class IndexOfEx01 {

	public static void main(String[] args) {
		
		String s = "abcedfabcdef";
		
		int dix1 = s.indexOf('e',0);
		System.out.println(dix1);
		
		int dix2 = s.indexOf('f',6);
		System.out.println(dix2);

	}

}

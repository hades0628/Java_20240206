package ex02;

public class SplitEx01 {

	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		
		String[] arr = animals.split(",");
		
		for(String a:arr) {
			System.out.println(a);
		}

	}

}

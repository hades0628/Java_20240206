package ex02;

public class JoinEx01 {

	public static void main(String[] args) {
		
		String animals = "dog,cat,bear";
		
		String[] arr = animals.split("," , 2);
		
		for(String a : arr) {
			System.out.println(a);
		}
		
		arr = animals.split(",");
		
		for(String a : arr) {
			System.out.println(a);
		}

	}

}

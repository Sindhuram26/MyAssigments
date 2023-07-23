package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="Sindhuja";
		char[] ch = name.toCharArray();
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(ch[i]);
		}
		
		
	}

}

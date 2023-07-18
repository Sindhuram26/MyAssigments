package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int firstNum=0;
		int secNum =1;
		int sum ;
		int range=8;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for(int i=0;i<=range;i++) {
			
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
		
		System.out.println(sum);
		

	}

	}}

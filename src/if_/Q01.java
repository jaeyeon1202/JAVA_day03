package if_;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		//입력받아 3의 배수를 판별하시오
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("num입력: ");
		num=sc.nextInt();
		if(num % 3 ==0) {
			System.out.println("3의 배수입니다.");
		}
		if(num%3 != 0) {
			System.out.println("3의 배수가 아니다.");
		}
		
		
		//세 수를 입력받아 가장 큰 수 출력
		int num1, num2, num3, max;
		
		System.out.print("num1입력: ");
		num1=sc.nextInt();
		
		System.out.print("num2입력: ");
		num2=sc.nextInt();
		
		System.out.print("num3입력: ");
		num3=sc.nextInt();
		
		if(num1> num2 && num1> num3) {
			System.out.println("가장 큰 수: "+num1);
		}
		if(num2>num1 && num2> num3) {
			System.out.println("가장 큰 수: "+num2);
		}
		if(num3>num1 && num3>num2) {
			System.out.println("가장 큰 수: "+num3);
		}
		
		
		
		//두 수를 입력받아 큰 수가 짝수면 출력
		int n1, n2;
		System.out.print("n1입력: ");
		n1=sc.nextInt();
		System.out.print("n2입력: ");
		n2=sc.nextInt();
		
		if(n1>n2 && n1%2==0) {
			System.out.println("큰수는 "+n1+"이고, 짝수이다.");
		}
		if(n2>n1 && n2%2==0) {
			System.out.println("큰수는 "+n2+"이고, 짝수이다.");
		}
		

	}

}

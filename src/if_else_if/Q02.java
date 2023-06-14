package if_else_if;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		//정수를 입력받아 아래와 같이 입력하시오
		// 1) 3의 배수이면서, 4의 배수
		// 2) 3의 배수
		// 3) 4의 배수
		// 4) 3의 배수도, 4의 배수도 해당안됨
		// 5) (0입력시 잘못입력)
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		/*
		if(num>0 && num%3==0 && num%4==0) {
			System.out.println("3의 배수이면서, 4의 배수");
		}else if(num>0 &&num%3 == 0) {
			System.out.println("3의 배수");
		}else if(num>0 && num%4==0) {
			System.out.println("4의 배수");
		}else if(num>0 && num%3!=0 && num%4!=0) {
			System.out.println("3의 배수도, 4의 배수도 아니다.");
		}else if(num==0){
			System.out.println("잘못입력");
		}
		*/
		if(num==0){
			System.out.println("잘못입력");
		}else if(num%3==0 && num%4==0) {
			System.out.println("3의 배수이면서, 4의 배수");
		}else if(num%3 == 0) {
			System.out.println("3의 배수");
		}else if(num%4==0) {
			System.out.println("4의 배수");
		}else if(num%3!=0 && num%4!=0) {
			System.out.println("3의 배수도, 4의 배수도 아니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

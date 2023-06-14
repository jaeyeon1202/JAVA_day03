package problems;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		//임의의 정수 2개를 입력받아 두 수를 비교하여 큰 수가 50을 초과하면 "최대 정수 입니다."를 출력하고 프로그램을 종료합니다.
		//초과하지 않는다면 바로 프로그램을 종료합니다.
		//단, IF문만 사용하며 딱 한 번만 사용해야 합니다. (else와 else if 사용 금지)
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		n1=sc.nextInt();
		System.out.print("정수2: ");
		n2=sc.nextInt();
		
		int result = (n1>n2)? n1:n2;
		
		if(result>50) {
			System.out.println("최대 정수 입니다.");
		}
		
	}

}

package if_else_if;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		//커피의 개당 가격은 2000원이다. 10개를 초과하면 초과하는 양에 대해서만 개당 1500원씩을 받는다.
		//커피의 개수를 입력받아 금액을 출력하시오
		int count, price;
		Scanner input = new Scanner(System.in);
		System.out.print("커피 개수 입력: ");
		count=input.nextInt();
		
		if(count <=10) {
			price = count * 2000;
			System.out.println("금액: "+price);
		}else if(count>10){
			price = 20000 + (1500*(count-10));
			System.out.println("금액: "+price);
		}
	
	}

}

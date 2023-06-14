package problems;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		최소 1시간 부터 최대 8시간까지 이용 가능한 카페가 있다.
		이용시간 1시간당 요금은 10,000원 이며
		3시간 이상 이용시 10% 할인, 5시간 이용시 20% 할인을 진행하고 있다.
		이용시간에 따른 금액을 출력하시오.
		(단, 가능하지 않은 이용 시간일 경우 가능한 이용시간을 알려주세요)
		ex) 1시간 --> 10,000원/ 3시간 --> 27,000원/ 5시간 --> 40,000원/ 그 외 "잘못 입력" 출력
		*/
		
		int time;
		double price;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이용시간 입력:");
		time=sc.nextInt();
		
		if(time>=1 && time <3) {
			price=time*10000;
			System.out.printf("금액: %d원",(int)price);
		}else if(time>=3 && time<5) {
			price=time*10000-(time*10000*0.1);
			System.out.printf("금액: %d원",(int)price);
		}else if(time>=5 && time<=8) {
			price=time*10000-(time*10000*0.2);
			System.out.printf("금액: %d원",(int)price);
		}else {
			System.out.println("잘못입력");
		}
		
	}

}

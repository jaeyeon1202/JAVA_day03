package problems;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		포도 , 사과, 오렌지, 딸기란 메뉴를 가진 음료자판기 만들기
		포도 선택시 "포도 음료가 나왔습니다."출력
		사과 선택시 "사과 음료가 나왔습니다."출력
		오렌지 선택시 "오렌지 음료가 나왔습니다."출력
		딸기 선택시 "딸기 음료가 나왔습니다."출력

		없는 메뉴 선택 시 "메뉴에 없는 음료입니다." 출력
		*/
		
		String menu;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.포도  2.사과  3.오렌지  4.딸기");
		System.out.print("메뉴선택: ");
		choice=sc.nextInt();
		
		if(choice==1) {
			System.out.println("포도 음료 나왔습니다.");
		}else if(choice==2) {
			System.out.println("사과음료");
		}else if(choice==3) {
			System.out.println("오렌지 음료");
		}else if(choice==4) {
			System.out.println("딸기음료");
		}else {
			System.out.println("그런 메뉴는 없어.");
		}
	}

}

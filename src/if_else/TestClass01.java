package if_else;

public class TestClass01 {

	public static void main(String[] args) {
		/*
		if(조건식){ //참인경우
			종속문장
		}else{ //if 조건이 거짓인 경우
			종속문장
		}
		다음문장
		*/
		
		int num = 11;
		if(num==10) {
			System.out.println("if실행");
		}else {
			System.out.println("else실행");
		}
		System.out.println("다음 문장 실행");

	}

}

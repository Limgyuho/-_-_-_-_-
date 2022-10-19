// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
public class Main {
	public static void main(String[] args) {
		int age;
		//정수형 age 라는 변수 선언
		
		age = 5;
		//age 라는 변수에 5를 초기화 한다
		
		System.out.println("버전1");
		
		if ( age > 19 && age < 60 ) {
			//19이상 그리고 60미만 참이면 실행
			System.out.println("미할인");
		}
		
		
		if ( age <= 19 || age >= 60 ) {
			//19이상 또는 60이하 참이면 실행
			System.out.println("할인");
		}
		
		System.out.println("버전2");
		
		if ( age  > 19 && age <60) {
			//19이상 그리고 60미만 참이면 실행
			System.out.println("미할인");
		}
		else if ( age <= 19 || age >= 60 ) {
			//위의 결과가 참이면 실행 안함
			System.out.println("할인");
		}
		
		System.out.println("버전3");
		
		if ( age  > 19 && age <60) {
			System.out.println("미할인");
		}
		else{ // 위의 결과를 제외한 나머지 실행
			System.out.println("할인");
		}
		
		System.out.println("버전3");
		
		if ( age  > 19 && age <60) {
			System.out.println("미할인");
		}
		if ( age <= 19) {
			System.out.println("할인");
		}
		if ( age >= 60) {
			System.out.println("할인");
		}
		
		System.out.println("버전4");
		
		
		if ( age <= 19) {
			System.out.println("할인");
		}
		if ( age >= 60) {
			System.out.println("할인");
		}
		if (age >19 ) {
			//이중 if 문 첫번째 조건식이 참이면 아래도 실행 하며 거짓이면 아래도 실행 하지 않는다
			if(age<60) {	
			System.out.println("미할인");
			}
		}
		
		
		
		
		//System.out.println("할인");
	}
}
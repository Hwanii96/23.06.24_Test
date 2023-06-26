package day03_basic;

public class Ex07_casting {

	public static void main(String[] args) {
		
		/*
		 * 형 변환 (casting)
		 * 
		 * 1. 자동 형 변환
		 * 		1) java가 스스로 형 변환
		 * 		2) 타입이 섞여있는 경우 작은 크기의 타입을 큰 크기의 타입으로 통일하는 방향으로 동작
		 * 			예) int 와 long 타입을 연산 -> int가 long으로 변환
		 * 		3) 정수와 실수타입을 연산 -> 실수로 변환 (정수는 4바이트고, double형의 실수는 8바이트 이기 때문에.)
		 * 
		 * 2. 강제 형 변환	
		 * 		1) 개발자가 직접 형 변환
		 *  	2) 기존 타입 상관 없이 원하는 타입으로 무조건 변환
		 * 		3) 변수명 앞에 (타입)을 붙여서 사용
		 * 			예) int n=10; 
		 * 				(double)n
		 * 		값의 손실이 있을 수 있다. 예를들어서, double n=10.9; 이면 (int)n 으로 강제형변환을 해주면 소수점 뒤는 모두 잘린다.
		 */

//		자동 형변환
		System.out.println(1+1.0); // 1 => 1.0 + 1.0 = 2.0
//		(1은 int타입의 정수, 1.0은 double타입의 실수 이면 얘네 둘을 더하면 2.0의 값이 나온다)
//		(double로 자동으로 따라가지므로 자동 형 변환 이다)
//		(4바이트 인 int와 8바이트 인 double을 연산을 하면 8바이트로 따라가진다)
//		(이미 8바이트 짜리가 할당되었기 때문에 상식적으로 작은 바이트 쪽으로 따라갈 수가 없다)
		
		double a=10;
//		java가 스스로 double a=10.0; 으로 변환 후 처리 (double 타입은 실수기 때문에) (나는 10으로 적었지만 !)
//		double 타입의 변수 a를 정수타입의 값인 10으로 초기화 했지만, 결국 실수로 변환 후 처리된다.
		System.out.println(a);
		
//		강제 형변환
		int b=(int)10.9;
		System.out.println(b);
//		무조건 소숫점 뒤에 있는 것을 버린다.
		
	}

}
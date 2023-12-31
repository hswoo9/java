package com.kh.control.practice;

public class F_Continue {
	/*
	 * continue 문
	 *   [표현법]
	 *     반복문(조건식) {
	 *       [continue;]
	 *       
	 *       .. 실행 코드 ..
	 *     } 
	 *     
	 *   - continue 문은 반복문 안에서만 사용이 가능하다.
	 *   - 반복문 안에서 continue 문을 만나게 되면 다음 구문들은 실행하지 않고
	 *     continue 문이 포함되어 있는 반복문의 조건식 또는 증감식으로 이동한다. 
	 */
	
	public void method1() {
		// 1부터 10까지 정수들의 합을 출력하시오.
		// 단, 5의 배수는 제외하고 덧셈한다.
		
		int sum = 0;
		
//		for (int i = 1; i <= 10; i++) {
//			if((i % 5) == 0) {
//				continue;
//			}
//			
//			sum += i;
//		}
		
		int i = 0;
		
		while(i <= 10) {
			if((i % 5) == 0) {
				i++;
				
				continue;
			}
			
			sum += i;
			
			i++;
		}
		
		System.out.println("합계 : " + sum);
	}

	/*
	 * 구구단(2 ~ 9단)을 출력하시오. (단, 홀수단을 빼고 출력)
	 */
	public void method2() {
		for (int i = 2; i <= 9; i++) {
			if((i % 2) != 0) {
				continue;
			}
			
			System.out.printf("== %d단 ==\n", i);
			
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}
		}
	}










}

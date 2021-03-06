/*
 * 사칙연산을 하는 전자계산기
 * 클래스 : Calc
 * 속성 : ?
 * 메소드 : plus, minus, multiple, divide, sum, print
 *    - plus(int x)     : 더하기
 *    - minus(int x)    : 빼기
 *    - multiple(int x) : 곱하기
 *    - divide(int x)   : 나누기
 *    - print() : 사칙연산 결과를 출력
 */
package calculator;

class Calc {
	int total;
	
	Calc() {
		total = 0;
	}
	
	Calc(int total) {
		this.total = total;
	}
	
	// 타입별로 가능하다 ex) int 하나 float 하나나
//	Calc(int total1) {
//		this.total = total;
//	}
	
	Calc(Calc calc) {
		total = calc.total();
	}

	void plus(int x) {
		total += x;
	}
	
	void minus(int x) {
		total -= x;
	}
	
	void multiple(int x) {
		total *= x;
	}
	
	void divide(int x) {
		total /= x;
	}
	
	void print() {
		System.out.println("total: " + total);
	}
	
	int total() {
		return total;
	}
}

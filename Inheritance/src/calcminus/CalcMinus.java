package calcminus;

import calc.Calc;

public class CalcMinus extends Calc {
	public CalcMinus() {
		super();  // 부모의 생성자를 호출
	}
	
	public CalcMinus(int sum) {
		super(sum); // 부모의 생성자를 호출
	}
	
	public int computeMinus(int x) {
		this.sum -= x;
		return this.sum;
	}

	public static void main(String[] args) {
		CalcMinus calc = new CalcMinus(1000);
		int sum = calc.compute(10);
		sum = calc.computeMinus(900);
		System.out.println("Calc:sum=" + sum);
		
		System.out.println("Calc:sum=" + calc.getSum());

		// CalcMinus는 Calc로부터 상속되었기 때문에 Calc.sum에 접근할 수 있다.
		System.out.println("Calc:sum=" + calc.sum); 
		
		// Calc.prevsum 디폴트 접근자로 선언된 필드는 자식 클래스에서 접근할 수 없다.
//		System.out.println("Calc:prevsum=" + calc.prevsum); 
		
		// Calc.privsum 비공개 접근자로 선언된 필드는 자식 클래스에서 접근할 수 없다.
//		System.out.println("Calc:privsum=" + calc.privsum); 
		
		System.out.println("Calc.privsum()=" + calc.getPrivSum());
	}
}

/*
 * Stack(스택)
 * 	- LIFO(Last In FIrst Out)
 * 	- 나중에 들어온 것이 먼저 나감 (후입선출)
 * 	- JVM 스택 메모리
 */
package stacks;

import java.util.Stack;

public class StackCoin2 {

	public static void main(String[] args) {
		Stack<Coin> coins = new Stack<Coin>();

		// push() : 객체를 스택에 넣음
		coins.push(new Coin(90));
		coins.push(new Coin(60));
		coins.push(new Coin(40));
		coins.push(new Coin(30));
		coins.push(new Coin(10));

		peekStack(coins);
		popStack(coins);
	}

	static void popStack(Stack<Coin> coins) {
		// pop() : 스택에서 객체를 꺼낸 후 삭제
		System.out.println("Stack: size : " + coins.size());
		while (!coins.isEmpty()) {
			Coin coin = coins.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue());
		}
		System.out.println();
	}

	// peek() : 스택에서 객체를 가져오며 삭제하지는 않는다.
	static void peekStack(Stack<Coin> coins) {
		// pop() : 스택에서 객체를 꺼낸 후 삭제
		System.out.println("Stack:peek -> size : " + coins.size());
		Coin coin = coins.peek();
		System.out.println("꺼내온 동전 : " + coin.getValue());
		System.out.println();
	}
}

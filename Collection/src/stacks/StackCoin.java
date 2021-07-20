/*
 * Stack(����)
 * 	- LIFO(Last In FIrst Out)
 * 	- ���߿� ���� ���� ���� ���� (���Լ���)
 * 	- JVM ���� �޸�
 */
package stacks;

import java.util.Stack;

public class StackCoin {

	public static void main(String[] args) {
		Stack<Coin> coins = new Stack<Coin>();

		// push() : ��ü�� ���ÿ� ����
		coins.push(new Coin(90));
		coins.push(new Coin(60));
		coins.push(new Coin(40));
		coins.push(new Coin(30));
		coins.push(new Coin(10));

		popStack(coins);
		popStack(coins);
	}

	static void popStack(Stack<Coin> coins) {
		// pop() : ���ÿ��� ��ü�� ���� �� ����
		System.out.println("Stack: size : "+ coins.size());
		while (!coins.isEmpty()) {
			Coin coin = coins.pop();
			System.out.println("������ ���� : " + coin.getValue());
		}
		System.out.println();
	}
	// peek() : ���ÿ��� ��ü�� �������� ���������� �ʴ´�.
	static void peekStack(Stack<Coin> coins) {
		// pop() : ���ÿ��� ��ü�� ���� �� ����
		System.out.println("Stack: size : "+ coins.size());
		while (!coins.isEmpty()) {
			Coin coin = coins.peek();
			System.out.println("������ ���� : " + coin.getValue());
		}
		System.out.println();
	}
}

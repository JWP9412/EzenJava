/*
 * Runnable �������̽��� �͸� ���� ��ü�� �����Ͽ�
 * Thread�� �����ڷ� �����Ͽ� �����带 ó��
 */
package beep;

import java.awt.Toolkit;

public class BeepTaskRun2 {

	public static void main(String[] args) {

		// ������ ��ü ����
		Thread beepThread = new Thread(new Runnable() { // �͸� ���� ��ü

			@Override
			public void run() {

				System.out.println(">BeepTask : BeepTaskRun2 start!!!");
				Toolkit toolkit = Toolkit.getDefaultToolkit(); // ��Ŷ ��ü ���
				for (int i = 0; i < 5; i++) {
					System.out.printf("beep (%d)!!!\n ", i + 1);
					toolkit.beep(); // ������ �߻�
					try {
						Thread.sleep(250); // millisecond(1000���� 1��) 0.5�ʰ� �Ͻ� ����
					} catch (Exception e) {
					}
					System.out.println("BeepTask : end loop");

				}
				System.out.println(">BeepTask : finished!!");

			}

		});

		// ������ ����(��׶���� ó��)
		beepThread.start();

		// �����尡 ���� �Ǳ� ���� ���� ���� �����尡 ����
		System.out.println("main thread end");
		System.out.println("THE END");
	}

}

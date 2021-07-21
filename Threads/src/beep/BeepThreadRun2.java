package beep;

import java.awt.Toolkit;

public class BeepThreadRun2 {

	public static void main(String[] args) {
		Thread beepThread = new Thread() { // �͸� ���� ��ü
			@Override
			public void run() {

				System.out.println(">BeepTask : start!!!");
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
				System.out.println("BeepTask : finished!!");

			}
		};
		beepThread.start();

		// �����尡 ���� �Ǳ� ���� ���� ���� �����尡 ����
		System.out.println("main thread end");
		System.out.println("THE END");

	}

}

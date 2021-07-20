package beep;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		System.out.println(">BeepTask : start!!!");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // ��Ŷ ��ü ���
		for (int i = 0; i < 5; i++) {
			System.out.printf("beep (%d)!!!\n ",i+1);
			toolkit.beep(); // ������ �߻�
			try {
				Thread.sleep(500); // millisecond(1000���� 1��) 0.5�ʰ� �Ͻ� ����
			} catch (Exception e) {
			} 
			System.out.println(">BeepTask : finished!!");
		}

	}
}

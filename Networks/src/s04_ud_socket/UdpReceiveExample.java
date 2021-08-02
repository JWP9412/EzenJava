package s04_ud_socket;
/*
 * UDP(User Datagram Protocol)
 * 	- �񿬰� ����
 * 	- �ŷڼ��� Ȯ������ �ʴ´�
 * 	- ������ ������� �ʴ´�
 * 	- �뵵 : �߽��ڰ� �Ϲ������� �����͸� �߽��ϰ�
 * 			���� �����ϴ��� ������ �ʿ䰡 ���� �� ���
 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(5002);
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[���� ����]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet);
						
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[������] ���� ����: "  + packet.getSocketAddress() + "] " + data);
					}
				} catch (Exception e) {
					System.out.println("[���� ����]");
				}
			}			
		};
		thread.start();
		
		Thread.sleep(10000);
		datagramSocket.close();
		
		System.out.println("[������] ����");
	}
}
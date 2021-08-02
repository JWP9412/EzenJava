package s04_ud_socket;
/*
 * UDP(User Datagram Protocol)
 * 	- 비연결 지향
 * 	- 신뢰성이 확보되지 않는다
 * 	- 순서가 보장되지 않는다
 * 	- 용도 : 발신자가 일방적으로 데이터를 발신하고
 * 			누가 수신하는지 검증할 필요가 없을 때 사용
 */
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveExample extends Thread {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket(5002);
		
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("[수신 시작]");
				try {
					while(true) {
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						datagramSocket.receive(packet);
						
						String data = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
						System.out.println("[수신자] 받은 내용: "  + packet.getSocketAddress() + "] " + data);
					}
				} catch (Exception e) {
					System.out.println("[수신 종료]");
				}
			}			
		};
		thread.start();
		
		Thread.sleep(10000);
		datagramSocket.close();
		
		System.out.println("[수신자] 종료");
	}
}

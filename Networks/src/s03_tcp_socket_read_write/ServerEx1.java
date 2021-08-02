package s03_tcp_socket_read_write;
import java.io.InputStream;
import java.io.OutputStream;
//���� ����
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		String message = null;
		
		if (args.length >= 1) {
			message = args[0];
		}
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost",5001));	//ServerSocket ����
			while(true) {
				System.out.println("[���� ��ٸ�]");
				Socket socket = serverSocket.accept(); 					// Ŭ���̾�Ʈ ���� ����
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(isa);
				System.out.println("[���� ������]" + isa.getHostName());
				
				byte[] bytes = null;
				
				
				InputStream is = socket.getInputStream();
				bytes = new byte[100];
				int readByteCount = is.read(bytes);
				message = new String(bytes,0,readByteCount,"UTF-8");
				System.out.println("[������ �ޱ� ����]" + message);
				
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("[������ ������ ����]");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch (Exception e) {	}
		
		if(!serverSocket.isClosed()) { 									//ServerSocket�� �������� ���� ���
			try {
				serverSocket.close();
			} catch (Exception e) {}
		}
		
	}

}
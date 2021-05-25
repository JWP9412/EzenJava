package section04.s07;
/*
 * GridPand Container Layout
 * 	- ��Ʈ���� ���ļ� ���� ������ ��ġ ���̾ƿ�
 * 	- ī�� ���̾ƿ�
 * 	- �״� ������ ���� ���� ���� �Ʒ��� ��ġ
 * 	- �� �������� �״� ��Ʈ���� �ֻ�ܿ� ��ġ
 * 	- �������̸� �� ���� ��Ʈ�Ѹ� ���̰� �ȴ�.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StackPaneLayout extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		
		ps.setTitle("StackPane Container Layout");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

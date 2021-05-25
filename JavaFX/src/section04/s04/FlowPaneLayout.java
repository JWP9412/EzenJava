package section04.s04;
/*
 * FlowPand Container Layout
 * 	- ��Ʈ���� ���ӵ� ������ ��ġ�ϴ� ���̾ƿ�
 * 	- ���ʿ��� �������� �����ؼ� ��ġ
 * 	- ������ �������� ������ ������ �����ؼ� ��ġ
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FlowPaneLayout extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		
		ps.setTitle("FlowPane Container Layout");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

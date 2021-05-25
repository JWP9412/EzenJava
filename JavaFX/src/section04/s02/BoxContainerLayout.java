package section04.s02;
/*
 * AnchorPane Layout
 * 	- ��ǥ�� �����Ͽ� ��Ʈ���� ��ġ�ϴ� �����̳�
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BoxContainerLayout extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		
		ps.setTitle("BoxContainer Layout");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

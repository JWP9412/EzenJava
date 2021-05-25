package section04.s03;
/*
 * BorderPane Container Layout
 * 	- top, bottom, left, right, center ������ ��ġ�ϴ� �����̳�
 * 	- �� �������� �ϳ��� ��Ʈ�� �Ǵ� �����̳ʸ� ��ġ�� �� �ִ�.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BorderPaneLayout2 extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root2.fxml"));
		Scene scene = new Scene(root);
		
		
		ps.setTitle("BorderPane Container Layout2");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

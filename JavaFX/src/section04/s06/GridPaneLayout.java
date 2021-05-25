package section04.s06;
/*
 * GridPand Container Layout
 * 	- ���� ��(Ÿ��) ũ�⸦ ���´�.
 * 	- ��� ���� �̷���� ���̺� ���·� ��ġ ���̾ƿ�
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GridPaneLayout extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		
		ps.setTitle("GridPane Container Layout");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

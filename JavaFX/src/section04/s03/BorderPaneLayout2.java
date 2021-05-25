package section04.s03;
/*
 * BorderPane Container Layout
 * 	- top, bottom, left, right, center 영역에 배치하는 컨테이너
 * 	- 각 영역에는 하나의 컨트롤 또는 컨테이너만 배치할 수 있다.
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

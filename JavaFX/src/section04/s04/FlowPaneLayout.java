package section04.s04;
/*
 * FlowPand Container Layout
 * 	- 컨트롤을 연속된 순서로 배치하는 레이아웃
 * 	- 왼쪽에서 오른쪽을 연속해서 배치
 * 	- 지정한 가로폭을 넘으면 밑으로 연속해서 배치
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

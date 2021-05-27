package section05.s03;
/*
 * FXML Controller
 * 	- 속성과 컨트롤러
 *  - 컨트롤 주입
 *  - 이벤트 핸들러 등록
 */
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FxmlController extends Application {
	
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		ps.setTitle("FXML Container Layout");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

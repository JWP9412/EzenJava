package section06.s01;
/*
 * 속성 감시와 바인딩
 */
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PropertyBinding extends Application {
	
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		ps.setTitle("PropertyBinding Container Layout");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

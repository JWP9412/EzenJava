package section03.s03;
/*
 * FXML Layout
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlLayout extends Application {
	@Override
	public void start(Stage ps) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("fxml9.fxml"));
		Scene scene = new Scene(root);
		
		
		ps.setTitle("FXML");
		ps.setScene(scene);
		ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

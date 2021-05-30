package exam01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Runner extends Application {
	@Override
	public void start(Stage ps) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);

		ps.setTitle("점수 관리");
		ps.setScene(scene);
		ps.show();
	}

	public static void main(String[] args) throws Exception {
		launch(args);
		Students st1 = new Students("11",11,11,11);
		System.out.println(st1.getName());
	}

}

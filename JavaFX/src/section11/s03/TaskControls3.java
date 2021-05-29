package section11.s03;
/*
 * 미디어 컨트롤
 * - MediaView
 * - MediaPlayer
 * - ProgressBar
 * - ProgressIndicator
 * - Slider
 */

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TaskControls3 extends Application{
	@Override
	public void start(Stage ps) throws Exception{
			Parent root = FXMLLoader.load(getClass().getResource("root3.fxml"));
			Scene scene = new Scene(root);
			
			ps.setTitle("Task3 Controls");
			ps.setScene(scene);
			ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
package section08.s02;
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

public class MenuControls extends Application{
	@Override
	public void start(Stage ps) throws Exception{
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("rootMenu.fxml"));
			Scene scene = new Scene(root);
			
			ps.setTitle("Menu Controls");
			ps.setScene(scene);
			ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
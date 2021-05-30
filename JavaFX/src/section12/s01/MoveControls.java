package section12.s01;
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

public class MoveControls extends Application{
	@Override
	public void start(Stage ps) throws Exception{
			Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
			Scene scene = new Scene(root);
			
			ps.setScene(scene);
			ps.setWidth(350);
			ps.setHeight(500);
			ps.setResizable(false);
			ps.setTitle("Move Controls");
			ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
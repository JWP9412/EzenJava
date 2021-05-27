package section09.s03;
/*
 * 커스텀 다이얼로그 컨트롤
 * 
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

public class CustomControls extends Application{
	@Override
	public void start(Stage ps) throws Exception{
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("rootCustom.fxml"));
			Scene scene = new Scene(root);
			
			ps.setTitle("Custom Controls");
			ps.setScene(scene);
			ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
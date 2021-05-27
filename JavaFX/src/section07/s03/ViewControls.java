package section07.s03;
/*
 * ºä ÄÁÆ®·Ñ
 * - ListView
 * - TableView
 * - ImageView
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

public class ViewControls extends Application{
	@Override
	public void start(Stage ps) throws Exception{
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("rootView.fxml"));
			Scene scene = new Scene(root);
			
			ps.setTitle("View Controls");
			ps.setScene(scene);
			ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
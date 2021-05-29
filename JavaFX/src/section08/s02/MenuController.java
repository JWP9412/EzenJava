package section08.s02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class MenuController implements Initializable{
	@FXML private TextArea textArea;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleNew(ActionEvent e) {
		textArea.appendText("New\n");
	}
	
	public void handleOpen(ActionEvent e) {
		textArea.appendText("Open\n");
	}
	
	public void handleSave(ActionEvent e) {
		textArea.appendText("Save\n");
	}
	
	public void handleExit(ActionEvent e) {
		Platform.exit();
	}
}

package exam01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class E1Con implements Initializable {
	@FXML
	private Button btnAdd;

	@FXML
	private TextField tf1;

	@FXML
	private TextField tf2;

	@FXML
	private TextField tf3;

	@FXML
	private TextField tf4;

	@FXML
	private Button btnSave;

	@FXML
	private Button btnCan;
	@FXML
	private TableView<Students> tableView;

	private Stage ps;

	public void setPrimaryStage(Stage ps) {
		this.ps = ps;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	void handleAdd(ActionEvent event) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(ps);
		dialog.setTitle("Ãß°¡");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("form.fxml")));
		dialog.setScene(scene);
		dialog.setResizable(true);
		dialog.show();
		Button btnCan = (Button) scene.lookup("#btnCan");
		btnCan.setOnAction(e -> dialog.close());
	}

	@FXML
	void handleSaveBtn(ActionEvent event) {
		Students students = new Students();
		
	}
}

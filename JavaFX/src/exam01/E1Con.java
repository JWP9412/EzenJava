package exam01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
	
	Stage dialog = new Stage(StageStyle.UTILITY);
	
	ObservableList studentsList =FXCollections.observableArrayList(
			new Students("test1", 11, 21, 31),
			new Students("test2", 21, 21, 31),
			new Students("test3", 31, 21, 31)
			);

	public void setPrimaryStage(Stage ps) {
		this.ps = ps;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	@FXML
	void handleAdd(ActionEvent event) throws Exception {
		
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(ps);
		dialog.setTitle("추가");

		Scene scene = new Scene(FXMLLoader.load(getClass().getResource("form.fxml")));
		dialog.setScene(scene);
		dialog.setResizable(true);
		dialog.show();
		Button btnCan = (Button) scene.lookup("#btnCan");
		btnCan.setOnAction(e -> dialog.close());
		
		// 아래 삭제할것
//		ObservableList studentsList =FXCollections.observableArrayList(
//				new Students("test1", 11, 21, 31),
//				new Students("test2", 21, 21, 31),
//				new Students("test3", 31, 21, 31)
//				);
		
		TableColumn tcName = tableView.getColumns().get(0);
		tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
		tcName.setStyle("-fx-alignment: CENTER;");
		
		TableColumn tcKor = tableView.getColumns().get(1);
		tcKor.setCellValueFactory(new PropertyValueFactory<>("kor"));
		
		TableColumn tcMath = tableView.getColumns().get(2);
		tcMath.setCellValueFactory(new PropertyValueFactory<>("math"));
		
		TableColumn tcEng = tableView.getColumns().get(3);
		tcEng.setCellValueFactory(new PropertyValueFactory<>("eng"));
		
		
		
		tableView.setItems(studentsList);
		
	}

	@FXML
	void handleSaveBtn(ActionEvent event) {
		studentsList.add(new Students(tf1,tf2,tf3,tf4));
		
		//Students students = new Students("text",1,2,3);
		//students.setKor(Integer.parseInt(tf2.getText()));
		
	}
}

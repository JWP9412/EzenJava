package exam01;

import java.io.IOException;
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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
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
	private Button btnBarChart;

	@FXML
	private Button chartBtnClose;
	@FXML
	private Button btnPieClose;
	@FXML
	private TableView<Students> tableView;

	@FXML
	private BarChart barBar;

	@FXML
	private PieChart pieChart;

	private Stage ps;

	private ObservableList<Students> list;

	public void setPrimaryStage(Stage ps) {
		this.ps = ps;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			list = FXCollections.observableArrayList();

			TableColumn tcName = tableView.getColumns().get(0);
			tcName.setCellValueFactory(new PropertyValueFactory<>("name"));
			tcName.setStyle("-fx-alignment: CENTER;");

			TableColumn tcKor = tableView.getColumns().get(1);
			tcKor.setCellValueFactory(new PropertyValueFactory<>("kor"));
			tcKor.setStyle("-fx-alignment: CENTER;");

			TableColumn tcMath = tableView.getColumns().get(2);
			tcMath.setCellValueFactory(new PropertyValueFactory<>("math"));
			tcMath.setStyle("-fx-alignment: CENTER;");

			TableColumn tcEng = tableView.getColumns().get(3);
			tcEng.setCellValueFactory(new PropertyValueFactory<>("eng"));
			tcEng.setStyle("-fx-alignment: CENTER;");

			tableView.setItems(list);
			tableView.setOnMouseClicked(event -> handleRowClicked(event));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@FXML
	private void handleAdd(ActionEvent event) {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnAdd.getScene().getWindow());
			// dialog.initOwner(ps);
			dialog.setTitle("추가");

			Scene scene = new Scene(FXMLLoader.load(getClass().getResource("form.fxml")));
			dialog.setScene(scene);
			dialog.setResizable(true);
			dialog.show();

			btnCan = (Button) scene.lookup("#btnCan");
			btnCan.setOnAction(e -> dialog.close());

			Button btnSave = (Button) scene.lookup("#btnSave");
			btnSave.setOnAction(e -> {
				TextField tf1 = (TextField) scene.lookup("#tf1");
				TextField tf2 = (TextField) scene.lookup("#tf2");
				TextField tf3 = (TextField) scene.lookup("#tf3");
				TextField tf4 = (TextField) scene.lookup("#tf4");

				Students students = new Students(tf1.getText(), Integer.parseInt(tf2.getText()),
						Integer.parseInt(tf3.getText()), Integer.parseInt(tf4.getText()));
				list.add(students);
				tf1.clear();
				tf2.clear();
				tf3.clear();
				tf4.clear();
				//dialog.close();
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void handleBtnBarChart(ActionEvent event) {
		try {
			Students students = new Students();
			Stage dialogBar = new Stage(StageStyle.UTILITY);
			dialogBar.initModality(Modality.WINDOW_MODAL);
			dialogBar.initOwner(btnBarChart.getScene().getWindow());
			dialogBar.setTitle("바 차트");

			Scene barChartScene = new Scene(FXMLLoader.load(getClass().getResource("barChart.fxml")));
			dialogBar.setScene(barChartScene);
			dialogBar.setResizable(true);
			dialogBar.show();

			// 바 차트 생성
			BarChart barBar = (BarChart) barChartScene.lookup("#barBar");

			XYChart.Series seKor = new XYChart.Series();
			seKor.setName("국어");
			ObservableList korList = FXCollections.observableArrayList();
			for (int i = 0; i < list.size(); i++) {
				korList.add(new XYChart.Data(list.get(i).getName(), list.get(i).getKor()));
			}
			seKor.setData(korList);
			barBar.getData().add(seKor);

			XYChart.Series seMath = new XYChart.Series();
			seMath.setName("수학");
			ObservableList mathList = FXCollections.observableArrayList();
			for (int i = 0; i < list.size(); i++) {
				mathList.add(new XYChart.Data(list.get(i).getName(), list.get(i).getMath()));
			}
			seMath.setData(mathList);
			barBar.getData().add(seMath);

			XYChart.Series seEng = new XYChart.Series();
			seEng.setName("영어");
			ObservableList engList = FXCollections.observableArrayList();
			for (int i = 0; i < list.size(); i++) {
				engList.add(new XYChart.Data(list.get(i).getName(), list.get(i).getEng()));
			}
			seEng.setData(engList);
			barBar.getData().add(seEng);

			Button chartBtnClose = (Button) barChartScene.lookup("#chartBtnClose");
			chartBtnClose.setOnAction(e -> dialogBar.close());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@FXML
	public void handleRowClicked(MouseEvent event) {
		if (event.getClickCount() != 2)
			return;
		try {

			Stage dialogPie = new Stage(StageStyle.UTILITY);
			dialogPie.initModality(Modality.WINDOW_MODAL);
			dialogPie.initOwner(btnAdd.getScene().getWindow());
			dialogPie.setTitle("파이 차트");

			//Parent pieChartScene = FXMLLoader.load(getClass().getResource("pieChart.fxml"));
			Scene pieChartScene = new Scene(FXMLLoader.load(getClass().getResource("pieChart.fxml")));
			PieChart pieChart = (PieChart) pieChartScene.lookup("#pieChart");
			Students stu = tableView.getSelectionModel().getSelectedItem();
			pieChart.setData(FXCollections.observableArrayList(
					new PieChart.Data("국어", stu.getKor()),
					new PieChart.Data("수학", stu.getMath()), 
					new PieChart.Data("영어", stu.getEng())
					));
			Button btnPieClose = (Button) pieChartScene.lookup("#btnPieClose");
			btnPieClose.setOnAction(e -> dialogPie.close());

			//Scene scene =new Scene(pieChartScene);
			dialogPie.setScene(pieChartScene);
			
			//dialogPie.setScene(scene);
			dialogPie.setResizable(true);
			dialogPie.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

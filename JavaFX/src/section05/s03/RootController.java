package section05.s03;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {
	@FXML
	private Button btnOk;
	@FXML
	private Button btnCancle;
	@FXML
	private Button btnExit;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
/*
		btnOk.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handleBtnOkAction(event);

			}

		});

		btnCancle.setOnAction(event -> handleBtnCancleAction(event));
		btnExit.setOnAction(event -> handleBtnExitAction(event));
*/	
	}
	public void handleBtnOk(ActionEvent event) {
		System.out.println("handleBtnOk 클릭");
	}
	public void handleBtnCancle(ActionEvent event) {
		System.out.println("handleBtnCancle 클릭");
	}
	public void handleBtnExit(ActionEvent event) {
		System.out.println("handleBtnExit 클릭");
	}
}

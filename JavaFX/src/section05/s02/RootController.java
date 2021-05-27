package section05.s02;

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

		btnOk.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				handleBtnOkAction(event);

			}

		});

		btnCancle.setOnAction(event -> handleBtnCancleAction(event));
		btnExit.setOnAction(event -> handleBtnExitAction(event));

	}

	private void handleBtnOkAction(ActionEvent event) {
		System.out.println("handleBtnOkAction 클릭");

	}

	private void handleBtnCancleAction(ActionEvent event) {
		System.out.println("handleBtnCancleAction 클릭");

	}

	private void handleBtnExitAction(ActionEvent event) {
		System.out.println("handleBtnExitAction 클릭");

	}
}

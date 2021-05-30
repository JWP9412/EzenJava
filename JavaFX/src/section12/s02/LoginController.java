package section12.s02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginController implements Initializable {
	@FXML
	private BorderPane login;

	@FXML
	private Button btnMain;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnMain.setOnAction(e -> handleBtnMain(e));

	}

	public void handleBtnMain(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			login.setTranslateX(0); 									//���۰��� 0 ���� ����
			
			Timeline tl = new Timeline();								
			KeyValue kv = new KeyValue(login.translateXProperty(),350);
			KeyFrame kf = new KeyFrame(
					Duration.millis(600),
					new EventHandler<ActionEvent>() {
						
						@Override
						public void handle(ActionEvent event) {
						root.getChildren().remove(login); // �ִϸ��̼� ���� �� �α��� ȭ�� ����
						}
					},
					kv
					);
			
			tl.getKeyFrames().add(kf);
			tl.play();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

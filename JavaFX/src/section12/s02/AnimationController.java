package section12.s02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class AnimationController implements Initializable {
    @FXML
    private Button btnLogin;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnLogin.setOnAction(e->handleBtnLogin(e));
		
	}
	public void handleBtnLogin(ActionEvent event) {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
			StackPane root = (StackPane) btnLogin.getScene().getRoot();
			root.getChildren().add(login);
			
			login.setTranslateX(350); //시작값을 350으로 설정(로그인 화면 폭)
			
			Timeline tl = new Timeline();								//종료값을 0으로 설정,0.1초간 지속
			KeyValue kv = new KeyValue(login.translateXProperty(),0);
			KeyFrame kf = new KeyFrame(Duration.millis(600), kv);
			tl.getKeyFrames().add(kf);
			tl.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package section07.s01;
/*
 * 버튼 컨트롤
 * 	-Button 		: 기본 버튼
 *  -CheckBox 		: 다중 체크박스에서 복수의 선택가능
 *  -RadioButton 	: 다중 라디오에서 하나만 선택가능
 *  -ToggleButton	: 토글(On/Off) 스위치 형태
 *  -HyperLink		: 사이트로 연결
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

public class ButtonControls extends Application{
	@Override
	public void start(Stage ps) throws Exception{
			Parent root = (Parent)FXMLLoader.load(getClass().getResource("rootBtn.fxml"));
			Scene scene = new Scene(root);
			
			ps.setTitle("Button Controls");
			ps.setScene(scene);
			ps.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
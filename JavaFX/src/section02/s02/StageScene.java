package section02.s02;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class StageScene extends Application{
	@Override
	public void start(Stage ps) throws Exception{
		VBox vbox = new VBox();			//컨테이너(Vertical)
		vbox.setPrefWidth(400);			//폭
		vbox.setPrefHeight(200);		//높이
		vbox.setAlignment(Pos.CENTER);	//정렬(배치:왼쪽, 가운데, 오른쪽,...)
		vbox.setSpacing(20);			
		
		Label label = new Label();
		label.setText("녕안, 자바FX JWP");
		label.setFont(new Font(50));
		
		Button btn = new Button();
		btn.setText("종료");
		btn.setOnAction(event->Platform.exit());	//이벤트 (람다식)
		
		vbox.getChildren().add(label);
		vbox.getChildren().add(btn);
		
		Scene scene = new Scene(vbox);
		
		ps.setTitle("Stage & Scene Demo");
		ps.setScene(scene);
		ps.show();}
	public static void main(String[] args) {
		
			launch(args);

	}

}

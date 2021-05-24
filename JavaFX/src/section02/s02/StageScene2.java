package section02.s02;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class StageScene2 extends Application{
	@Override
	public void start(Stage ps) throws Exception{
		HBox hbox = new HBox();			//�����̳�(Horizontal)
		hbox.setPrefWidth(800);			//��
		hbox.setPrefHeight(200);		//����
		//hbox.setAlignment(Pos.CENTER);	//����(��ġ:����, ���, ������,...)
		//hbox.setAlignment(Pos.BASELINE_CENTER);	//����(��ġ:����, ���, ������,...)
		hbox.setAlignment(Pos.CENTER_RIGHT);
		hbox.setSpacing(20);			
		
		Label label = new Label();
		label.setText("���, �ڹ�FX JWP");
		label.setFont(new Font(50));
		
		Button btn = new Button();
		btn.setText("����");
		btn.setOnAction(event->Platform.exit());	//�̺�Ʈ (���ٽ�)
		
		hbox.getChildren().add(label);
		hbox.getChildren().add(btn);
		
		Scene scene = new Scene(hbox);
		
		ps.setTitle("Stage & Scene Demo");
		ps.setScene(scene);
		ps.show();}
	public static void main(String[] args) {
			launch(args);

	}

}

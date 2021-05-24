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
		VBox vbox = new VBox();			//�����̳�(Vertical)
		vbox.setPrefWidth(400);			//��
		vbox.setPrefHeight(200);		//����
		vbox.setAlignment(Pos.CENTER);	//����(��ġ:����, ���, ������,...)
		vbox.setSpacing(20);			
		
		Label label = new Label();
		label.setText("���, �ڹ�FX JWP");
		label.setFont(new Font(50));
		
		Button btn = new Button();
		btn.setText("����");
		btn.setOnAction(event->Platform.exit());	//�̺�Ʈ (���ٽ�)
		
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

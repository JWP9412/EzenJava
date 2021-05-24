package section03.s01;


import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HBoxLayout extends Application{
	@Override
	public void start(Stage ps) throws Exception{
		HBox hbox = new HBox();						//HBox �����̳� ����
		hbox.setPadding(new Insets(20));			//���� ���� ����
		hbox.setSpacing(100);						//��Ʈ�� ���� ���� ���� ����
		
		TextField tf = new TextField();				//TextField ��Ʈ�� ����
		tf.setPrefWidth(700);						//TextField�� �� ����
		tf.setPrefHeight(400);
		tf.setFont(new Font(30));
		
		
		Button btn = new Button();					//Button ��Ʈ�� ����
		btn.setText("Ȯ-��");						//Button ���� ����
		
		ObservableList list = hbox.getChildren();	//HBox�� ObservableList ���
		list.add(tf);								//TextField ��Ʈ�� ��ġ
		list.add(btn);								//Button�� ��Ʈ�� ��ġ
		
		Scene scene = new Scene(hbox);				//��� ����
		
		ps.setTitle("��");							//������ â ���� ����
		ps.setScene(scene);							//������ â�� ��� ����
		ps.show();									//������ â �����ֱ�
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}